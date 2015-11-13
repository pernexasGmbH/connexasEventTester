package com.pernexas.EventListener.sap;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.sap.ConnexasCreateALDocumentSentEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasCreateALDocumentSentEventListener extends BaseEventListener implements ApplicationListener<ConnexasCreateALDocumentSentEvent>
{
    @Override
    public void onApplicationEvent(ConnexasCreateALDocumentSentEvent connexasCreateALDocumentSentEvent)
    {
        logClass(connexasCreateALDocumentSentEvent);
        log(connexasCreateALDocumentSentEvent);
    }
}
