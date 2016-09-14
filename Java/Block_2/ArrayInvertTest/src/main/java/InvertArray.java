import java.util.Arrays;

public class InvertArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Invert invert = new Invert();
        System.out.println("Aaray = " + Arrays.toString(array));
        array = invert.Invert(array);
        System.out.println("Inversion of array = " + Arrays.toString(array));
    }
}
