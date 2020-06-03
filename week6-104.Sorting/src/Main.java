
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i=0; i<array.length - 1; i++){
            if (array[i+1] < smallest){
                smallest = array[i+1];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int indexSmallest = 0;
        for (int i=0; i<array.length - 1; i++){
            if (array[i+1] < array[indexSmallest]){
                indexSmallest = i+1;
            }
        }
        return indexSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexSmallest = index;
        for (int i=index; i<array.length - 1; i++){
            if (array[i+1] < array[indexSmallest]){
                indexSmallest = i+1;
            }
        }
        return indexSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++){
            System.out.println( Arrays.toString(array) );
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
