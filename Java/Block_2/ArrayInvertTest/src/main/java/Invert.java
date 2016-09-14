import java.lang.reflect.Array;

public class Invert {

    public int[] Invert (int[] array){
        int tempValue;
        int arrayLength = Array.getLength(array);
        for (int i = 0; i < arrayLength / 2; i++) {
            tempValue = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = tempValue;
        }
        return array;
    }
}
