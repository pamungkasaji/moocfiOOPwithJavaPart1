
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    // print the first 4 numbers and comma together then print the last number 
    //separately
    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
