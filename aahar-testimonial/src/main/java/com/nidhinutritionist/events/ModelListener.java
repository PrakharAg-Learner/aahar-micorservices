package com.nidhinutritionist.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.nidhinutritionist.model.Testimonial;
import com.nidhinutritionist.service.SequenceGeneratorService;


@Component
public class ModelListener extends AbstractMongoEventListener<Testimonial> {

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public ModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Testimonial> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(Testimonial.SEQUENCE_NAME));
        }
    }
}