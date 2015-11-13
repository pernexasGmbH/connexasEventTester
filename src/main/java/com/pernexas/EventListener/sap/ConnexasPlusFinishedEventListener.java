package com.pernexas.EventListener.sap;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.sap.ConnexasPlusFinishedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasPlusFinishedEventListener extends BaseEventListener implements ApplicationListener<ConnexasPlusFinishedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasPlusFinishedEvent connexasPlusFinishedEvent)
    {
        logClass(connexasPlusFinishedEvent);
        log(connexasPlusFinishedEvent);
    }
}
