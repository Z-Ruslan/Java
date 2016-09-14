import java.lang.reflect.Array;
import java.util.Arrays;

public class Start {
    public static void main (String[] args) {
        int a = 7;
        int b = 9;
        int [] array = {1, 45, 5, 24, 50};
        int index = 2;
        Operations Operations = new Operations();

        System.out.println("a = " +a+ " and b = " +b+" operations results:");
        System.out.println("Sum: " + Operations.Sum(a, b));
        System.out.println("Division: " + Operations.Division(a, b));
        System.out.println("Multiplication: " + Operations.Multiplication(a, b));
        System.out.println("Substraction: " + Operations.Substraction(a, b));

        System.out.println("Get value by index from array results:");
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Index = " + index);
        System.out.println("Result value = " + Operations.GetValueFromArrayByIndex(index, array));
    }
}
