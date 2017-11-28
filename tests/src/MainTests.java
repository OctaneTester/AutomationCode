import org.junit.Assert;
import org.junit.Test;

public class MainTests {

    @Test
    public void basicTrueTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testConcatenate() {
        String result = "one" + "two";
        Assert.assertEquals("onetwo", result);
    }

    @Test
    public void basicFalseTest() {
        Assert.assertTrue(false);
    }

}
