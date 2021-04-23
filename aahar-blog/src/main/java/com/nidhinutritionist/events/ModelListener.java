package com.nidhinutritionist.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.nidhinutritionist.model.Blog;
import com.nidhinutritionist.service.SequenceGeneratorService;


@Component
public class ModelListener extends AbstractMongoEventListener<Blog> {

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public ModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Blog> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(Blog.SEQUENCE_NAME));
        }
    }
}