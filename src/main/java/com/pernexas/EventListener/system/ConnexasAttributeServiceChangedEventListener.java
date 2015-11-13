package com.pernexas.EventListener.system;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.system.ConnexasAttributeServiceIndexChangedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasAttributeServiceChangedEventListener extends BaseEventListener implements ApplicationListener<ConnexasAttributeServiceIndexChangedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasAttributeServiceIndexChangedEvent connexasAttributeServiceIndexChangedEvent)
    {
        logClass(connexasAttributeServiceIndexChangedEvent);
        log(connexasAttributeServiceIndexChangedEvent);
    }
}
