package com.nidhinutritionist.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.nidhinutritionist.model.AdminUser;
import com.nidhinutritionist.service.SequenceGeneratorService;


@Component
public class ModelListener extends AbstractMongoEventListener<AdminUser> {

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public ModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<AdminUser> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(AdminUser.SEQUENCE_NAME));
        }
    }
}