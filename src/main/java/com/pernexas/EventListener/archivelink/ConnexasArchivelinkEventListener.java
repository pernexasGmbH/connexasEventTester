package com.pernexas.EventListener.archivelink;

import com.pernexas.EventListener.BaseEventListener;
import com.pernexas.framexas.events.AsyncEventListener;
import com.pernexas.framexas.events.archivelink.*;
import org.springframework.context.ApplicationListener;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
@AsyncEventListener
public class ConnexasArchivelinkEventListener extends BaseEventListener implements ApplicationListener<BaseArchivelinkEvent>
{
    @Override
    public void onApplicationEvent(BaseArchivelinkEvent baseArchivelinkEvent)
    {
        logClass(baseArchivelinkEvent);
        log(baseArchivelinkEvent);
    }
}
