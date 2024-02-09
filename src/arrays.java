import java.util.Arrays;

public class arrays {
    public static void main (String[] args) {
        int[] numbers = { 2, 3, 5, 4, 1 };

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println();
        // multidimensional arrays
        int[][] mNumbers = { { 1, 2, 3}, { 4, 5, 6 } };
        mNumbers[0][0] = 1;
        System.out.println(Arrays.deepToString(mNumbers));
    }
}
