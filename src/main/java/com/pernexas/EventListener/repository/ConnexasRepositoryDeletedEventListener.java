package com.pernexas.EventListener.repository;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.repository.ConnexasRepositoryDeletedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class ConnexasRepositoryDeletedEventListener extends BaseEventListener implements ApplicationListener<ConnexasRepositoryDeletedEvent>
{
    @Override
    public void onApplicationEvent(ConnexasRepositoryDeletedEvent connexasRepositoryDeletedEvent)
    {
        logClass(connexasRepositoryDeletedEvent);
        log(connexasRepositoryDeletedEvent);
    }
}
