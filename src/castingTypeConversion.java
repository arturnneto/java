public class castingTypeConversion {
    public static void main(String[] args) {
        // implicit casting
        short x = 1;
        int y = x + 2; // y got converted to int
        System.out.println(y);

        double a = 1.1;
        int b = (int)a + 2;
        System.out.println(b);

        // converting string to number
        String notInteger = "1";
        // int one = (int)notInteger + 2; ----> this would not work
        int one = Integer.parseInt(notInteger) + 2;
        Short.parseShort(notInteger);
        Float.parseFloat(notInteger);
        System.out.println(one);
    }
}
