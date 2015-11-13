package com.pernexas.EventListener.sap;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.sap.ConnexasBarcodesSentEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasBarcodeSentEventListener extends BaseEventListener implements ApplicationListener<ConnexasBarcodesSentEvent>
{
    @Override
    public void onApplicationEvent(ConnexasBarcodesSentEvent connexasBarcodesSentEvent)
    {
        logClass(connexasBarcodesSentEvent);
        log(connexasBarcodesSentEvent);
    }
}
