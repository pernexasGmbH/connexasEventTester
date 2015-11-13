package com.pernexas.EventListener.document;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.document.ConnexasALDocumentDeletedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasALDocumentDeletedEventListener extends BaseEventListener implements ApplicationListener<ConnexasALDocumentDeletedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasALDocumentDeletedEvent connexasALDocumentDeletedEvent)
    {
        logClass(connexasALDocumentDeletedEvent);
        log(connexasALDocumentDeletedEvent);
    }
}
