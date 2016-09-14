import org.junit.Assert;
import org.junit.Test;
/**
 * Created by 1 on 11.09.2016.
 */
public class SumTest {

    Operations Operations = new Operations();
    int a;
    int b;
    int result;

    @Test
    public void SumPositiveNumbersTest(){
        a = 10;
        b = 10;
        result = Operations.Sum(a,b);
        Assert.assertEquals(20, result);
    }

    @Test
    public void SumNegativeNumbersTest(){
        a = -10;
        b = -10;
        result = Operations.Sum(a,b);
        Assert.assertEquals(-20, result);
    }
}
