package task1;

import org.junit.Assert;
import org.junit.Test;


public class StringHandlerTest {
    private StringHandler stringHandler = new StringHandler();

    @Test
    public void testReverseStringHello() {
        String actual = stringHandler.reverseString("Hello");

        Assert.assertEquals("olleH", actual);
    }

    @Test
    public void testReverseStringWithSpace() {
        String actual = stringHandler.reverseString("Hello hello");

        Assert.assertEquals("olleh olleH", actual);
    }

    @Test
    public void testReverseStringControlLine() {
        String actual = stringHandler.reverseString("Java test");

        Assert.assertEquals("tset avaJ", actual);
    }

}