package com.pernexas.EventListener.sap;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.sap.ConnexasSapReplicationFinishedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasSapReplicateFinishedEventListener extends BaseEventListener implements ApplicationListener<ConnexasSapReplicationFinishedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasSapReplicationFinishedEvent connexasSapReplicationFinishedEvent)
    {
        logClass(connexasSapReplicationFinishedEvent);
        log(connexasSapReplicationFinishedEvent);
    }
}
