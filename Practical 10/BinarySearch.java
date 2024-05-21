public class BinarySearch {

    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 9;
        System.out.println("Index of " + key + " is: " + binarySearch(array, key));
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            int cmp = list[mid].compareTo(key);
            if (cmp == 0) {
                return mid; 
            } else if (cmp < 0) {
                low = mid + 1; f
            } else {
                high = mid - 1; 
            }
        }

        return -1; 
    }
}
