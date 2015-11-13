package com.pernexas.EventListener.repository;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.repository.ConnexasCertificateDeactivatedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasCertificateDeactivatedEventListener extends BaseEventListener implements ApplicationListener<ConnexasCertificateDeactivatedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasCertificateDeactivatedEvent connexasCertificateDeactivatedEvent)
    {
        logClass(connexasCertificateDeactivatedEvent);
        log(connexasCertificateDeactivatedEvent);
    }
}
