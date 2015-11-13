package com.pernexas.EventListener.repository;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.repository.ConnexasRepositoryUpdatedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasRepositoryUpdatedEventListener extends BaseEventListener implements ApplicationListener<ConnexasRepositoryUpdatedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasRepositoryUpdatedEvent connexasRepositoryUpdatedEvent)
    {
        logClass(connexasRepositoryUpdatedEvent);
        log(connexasRepositoryUpdatedEvent);
    }
}
