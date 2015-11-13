package com.pernexas.EventListener.sap;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.sap.ConnexasWorkflowSentEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasWorkflowSentEventListener extends BaseEventListener implements ApplicationListener<ConnexasWorkflowSentEvent>
{
    @Override
    public void onApplicationEvent(ConnexasWorkflowSentEvent connexasWorkflowSentEvent)
    {
        logClass(connexasWorkflowSentEvent);
        log(connexasWorkflowSentEvent);
    }
}
