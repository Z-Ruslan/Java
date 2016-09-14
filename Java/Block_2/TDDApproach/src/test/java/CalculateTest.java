import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {

    Method Method = new Method();
    int result;
    int[] empty = {};
    int[] negative = {-5, -3, -1, -7};
    int[] sum = {4, -3, 5, -10, 8};

    @Test
    public void CalculateEmptyArrayTest(){
        result = Method.Calculate(empty);
        Assert.assertEquals(0, result);
    }

    @Test
    public void CalculateArrayWithOnlyNegativeNumbersTest(){
        result = Method.Calculate(negative);
        Assert.assertEquals(0, result);
    }

    @Test
    public void CalculateArrayWithAllCorrectNumbersTest(){
        result = Method.Calculate(sum);
        Assert.assertEquals(4, result);
    }
}
