package com.pernexas.EventListener.system;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.system.ConnexasBootstrappingFinishedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasBootstrappingFinishedEventListener extends BaseEventListener implements ApplicationListener<ConnexasBootstrappingFinishedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasBootstrappingFinishedEvent connexasBootstrappingFinishedEvent)
    {
        logClass(connexasBootstrappingFinishedEvent);
        log(connexasBootstrappingFinishedEvent);
    }
}
