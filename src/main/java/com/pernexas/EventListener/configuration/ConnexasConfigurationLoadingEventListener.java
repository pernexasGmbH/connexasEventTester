package com.pernexas.EventListener.configuration;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.configuration.ConnexasConfigurationLoadingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasConfigurationLoadingEventListener extends BaseEventListener implements ApplicationListener<ConnexasConfigurationLoadingEvent>
{
    @Override
    public void onApplicationEvent(ConnexasConfigurationLoadingEvent connexasConfigurationLoadingEvent)
    {
        logClass(connexasConfigurationLoadingEvent);
        log(connexasConfigurationLoadingEvent);
    }
}
