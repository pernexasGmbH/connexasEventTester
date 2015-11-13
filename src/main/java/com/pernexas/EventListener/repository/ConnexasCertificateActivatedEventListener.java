package com.pernexas.EventListener.repository;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.repository.ConnexasCertificateActivatedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasCertificateActivatedEventListener extends BaseEventListener implements ApplicationListener<ConnexasCertificateActivatedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasCertificateActivatedEvent connexasCertificateActivatedEvent)
    {
        logClass(connexasCertificateActivatedEvent);
        log(connexasCertificateActivatedEvent);
    }
}
