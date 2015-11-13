package com.pernexas.EventListener.document;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.document.ConnexasALDocumentUpdatedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasALDocumentUpdatedEventListener extends BaseEventListener implements ApplicationListener<ConnexasALDocumentUpdatedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasALDocumentUpdatedEvent connexasALDocumentUpdatedEvent)
    {
        logClass(connexasALDocumentUpdatedEvent);
        log(connexasALDocumentUpdatedEvent);
    }
}
