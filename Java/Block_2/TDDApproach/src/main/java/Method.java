import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {

    //Calculating of positive values's sum in array

    public int Calculate (int[] array){
        int arrayLength = Array.getLength(array);
        int sum = 0;

        //If array is empty - return 0
        if (arrayLength == 0) return 0;

        //If array consists form negative data - return 0
        boolean containPositive = false;
        for (int i = 0; i < arrayLength; i++){
            if (array[i] > 0) containPositive = true;
        }
        if (!containPositive) return 0;

        //Calculating of result
        for (int i = 0; i < arrayLength; i++){
            sum = sum + array[i];
        }
        return sum;
    }
}
