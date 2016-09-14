import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        int [] array = {33, 18, 80, -15, 9, 20, 100, 45};
        SortingMethods Sort = new SortingMethods();

        System.out.println("Array before sort = " + Arrays.toString(array));
        System.out.println("Bubble Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.BubbleSort(array)));
        System.out.println("Selection Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.SelectionSort(array)));
        System.out.println("Insertion Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.InsertionSort(array)));
    }
}
