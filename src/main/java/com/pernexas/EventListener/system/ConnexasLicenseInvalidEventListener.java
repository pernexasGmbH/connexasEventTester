package com.pernexas.EventListener.system;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.system.ConnexasLicenseInvalidEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasLicenseInvalidEventListener extends BaseEventListener implements ApplicationListener<ConnexasLicenseInvalidEvent>
{
    @Override
    public void onApplicationEvent(ConnexasLicenseInvalidEvent connexasLicenseInvalidEvent)
    {
        logClass(connexasLicenseInvalidEvent);
        log(connexasLicenseInvalidEvent);
    }
}
