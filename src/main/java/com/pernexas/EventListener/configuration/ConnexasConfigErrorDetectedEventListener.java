package com.pernexas.EventListener.configuration;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.configuration.ConnexasConfigErrorDetectedEvent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasConfigErrorDetectedEventListener extends BaseEventListener implements ApplicationListener<ConnexasConfigErrorDetectedEvent>
{
    private static final Log LOG = LogFactory.getLog(ConnexasConfigErrorDetectedEventListener.class);
    @Override
    public void onApplicationEvent(ConnexasConfigErrorDetectedEvent connexasConfigErrorDetectedEvent)
    {
        logClass(connexasConfigErrorDetectedEvent);
        log(connexasConfigErrorDetectedEvent);
    }
}
