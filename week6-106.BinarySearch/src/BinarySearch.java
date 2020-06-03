public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int lowerLimit = 0;
        int upperLimit = array.length - 1;
        boolean found = false;

        while (lowerLimit <= upperLimit) {
            int mid = (lowerLimit + upperLimit) / 2;
            if (array[mid] < searchedValue) {
                lowerLimit = mid + 1;
            } else {
                upperLimit = mid - 1;
            }
        }
        if (array[lowerLimit] == searchedValue){
            found = true;
        }
        return found;
    }
}
