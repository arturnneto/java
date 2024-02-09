import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strArray = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"};

        // Sorting
        Arrays.sort(intArray);
        Arrays.fill(intArray, 5);
        Arrays.toString(intArray);
        Arrays.copyOf(strArray, strArray.length);
        Arrays.equals(intArray, intArray);
        Arrays.binarySearch(intArray, 6);


    }
}
