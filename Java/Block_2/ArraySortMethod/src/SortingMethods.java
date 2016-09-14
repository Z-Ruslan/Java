import java.lang.reflect.Array;

public class SortingMethods {

    public int[] BubbleSort(int [] a){
        int arrayLength = Array.getLength(a);
        for (int i = (arrayLength - 1); i >= 0; i--){
            for (int j = 1; j <= i; j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public int[] SelectionSort(int[] a){
        int arrayLength = Array.getLength(a);
        for (int i = 0; i < arrayLength-1; i++)
        {
            int min = i;
            for (int j = i+1; j < arrayLength; j++)
            if (a[j] < a[min]) min = j;
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }

    public int[] InsertionSort(int[] a){
        int arrayLength = Array.getLength(a);
        for (int i=1; i < arrayLength; i++) {
            int index = a[i]; int j = i;
            while (j > 0 && a[j-1] > index) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = index;
        }
    return a;
    }
}
