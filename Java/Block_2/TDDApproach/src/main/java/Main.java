import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        int[] array = {33, 18, 80, -15, 9, 20, 100, 45};
        int[] sum = {4, -3, 5, -10, 8};

        Method Method = new Method();
        int res = Method.Calculate(sum);
        System.out.println("Array before sort = " + Arrays.toString(array));
    }
}
