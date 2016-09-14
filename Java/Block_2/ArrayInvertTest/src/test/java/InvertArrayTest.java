import org.junit.Assert;
import org.junit.Test;

public class InvertArrayTest {

    Invert invert = new Invert();
    int [] empty = {};
    int [] one = {5};
    int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int [] oppositeArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int [] result;

    @Test
    public void InvertEmptyArray(){
        result = invert.Invert(empty);
        Assert.assertArrayEquals(empty, result);
    }

    @Test
    public void InvertArrayOfOneValue(){
        result = invert.Invert(one);
        Assert.assertArrayEquals(one, result);
    }

    @Test
    public void InvertCorrectArray(){
        result = invert.Invert(array);
        Assert.assertArrayEquals(oppositeArray, result);
    }

}
