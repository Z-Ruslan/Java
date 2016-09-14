import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 1 on 11.09.2016.
 */
public class SubstractionTest {
    Operations Operations = new Operations();
    int a;
    int b;
    int result;

    @Test
    public void SubstractionPositiveNumbersTest(){
        a = 10;
        b = 10;
        result = Operations.Substraction(a,b);
        Assert.assertEquals(0, result);
    }

    @Test
    public void SubstractionNegativeNumbersTest(){
        a = -10;
        b = -20;
        result = Operations.Substraction(a,b);
        Assert.assertEquals(10, result);
    }
}
