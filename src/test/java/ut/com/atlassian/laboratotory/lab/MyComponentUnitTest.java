package ut.com.atlassian.laboratotory.lab;

import org.junit.Test;
import com.atlassian.laboratotory.lab.api.MyPluginComponent;
import com.atlassian.laboratotory.lab.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}