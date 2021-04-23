package com.nidhinutritionist.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.nidhinutritionist.model.Footer;
import com.nidhinutritionist.service.SequenceGeneratorService;


@Component
public class FooterModelListener extends AbstractMongoEventListener<Footer> {

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public FooterModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Footer> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.generateSequence(Footer.SEQUENCE_NAME));
        }
    }
}