public class arithmethicExpressions {

    public static void main(String[] args) {
        // basic
        int plus = 10 + 3;
        int minus = 10 - 3;
        double division = (double)10 / (double)3;
        int multiplication = 10 * 3;
        System.out.println(division);

        System.out.println();
        // increment/decrement
        int x = 1;
        int y = x++; // this way, y == 1;
        int z = ++x; // here,     y == 2;
        x++;
        x += 2;
        System.out.println(x);
    }
}
