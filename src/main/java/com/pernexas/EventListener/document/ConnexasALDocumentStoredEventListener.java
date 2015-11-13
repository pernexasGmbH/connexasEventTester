package com.pernexas.EventListener.document;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.document.ConnexasALDocumentStoredEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasALDocumentStoredEventListener extends BaseEventListener implements ApplicationListener<ConnexasALDocumentStoredEvent>
{
    @Override
    public void onApplicationEvent(ConnexasALDocumentStoredEvent connexasALDocumentStoredEvent)
    {
        logClass(connexasALDocumentStoredEvent);
        log(connexasALDocumentStoredEvent);
    }
}
