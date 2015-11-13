package com.pernexas.EventListener;

import com.pernexas.EventListener.archivelink.ConnexasArchivelinkEventListener;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationEvent;

import java.util.Map;

/**
 * @author Philipp Höfler, pernexas GmbH
 * @since 10.08.15
 */
public class BaseEventListener
{
    protected static final Log LOG = LogFactory.getLog(ConnexasArchivelinkEventListener.class);

    protected void logClass(ApplicationEvent event)
    {
        LOG.debug(String.format("*** %s ***", event.getClass().getSimpleName()));
    }

    protected void log(Object clazz)
    {
        try
        {
            Map<String, String> methods = BeanUtils.describe(clazz);
            for(Map.Entry<String, String> entry : methods.entrySet())
            {
                LOG.debug(String.format("%s: %s", entry.getKey(), entry.getValue()));
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
