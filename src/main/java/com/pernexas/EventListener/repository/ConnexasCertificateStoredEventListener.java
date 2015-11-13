package com.pernexas.EventListener.repository;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.repository.ConnexasCertificateStoredEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasCertificateStoredEventListener extends BaseEventListener implements ApplicationListener<ConnexasCertificateStoredEvent>
{
    @Override
    public void onApplicationEvent(ConnexasCertificateStoredEvent connexasCertificateStoredEvent)
    {
        logClass(connexasCertificateStoredEvent);
        log(connexasCertificateStoredEvent);
    }
}
