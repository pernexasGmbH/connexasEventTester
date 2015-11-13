package com.pernexas.EventListener.configuration;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.configuration.ConnexasConfigurationLoadedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasConfigurationLoadedEventListener extends BaseEventListener implements ApplicationListener<ConnexasConfigurationLoadedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasConfigurationLoadedEvent connexasConfigurationLoadedEvent)
    {
        logClass(connexasConfigurationLoadedEvent);
        log(connexasConfigurationLoadedEvent);
    }
}
