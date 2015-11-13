package com.pernexas.EventListener.repository;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.repository.ConnexasRepositoryCreatedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasRepositoryCreatedEventListener extends BaseEventListener implements ApplicationListener<ConnexasRepositoryCreatedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasRepositoryCreatedEvent connexasRepositoryCreatedEvent)
    {
        logClass(connexasRepositoryCreatedEvent);
        log(connexasRepositoryCreatedEvent);
    }
}
