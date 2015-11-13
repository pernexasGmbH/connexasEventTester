package com.pernexas.EventListener.configuration;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.configuration.ConnexasConfigMissingPropertyFoundEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasConfigMissingPropertyFoundEventListener extends BaseEventListener implements ApplicationListener<ConnexasConfigMissingPropertyFoundEvent>
{
    @Override
    public void onApplicationEvent(ConnexasConfigMissingPropertyFoundEvent connexasConfigMissingPropertyFoundEvent)
    {
        logClass(connexasConfigMissingPropertyFoundEvent);
        log(connexasConfigMissingPropertyFoundEvent);
    }
}
