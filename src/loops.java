import java.util.Scanner;

public class loops {

    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + i);
        }

        System.out.println();
        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("Bye World " + i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        System.out.println();
        // do... while --> can be used if the first case is false
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        System.out.println();
        // for each loop
        String[] fruits = { "Apple", "Mango", "Orange" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // looping in reverse order:
        for (int x = fruits.length - 1; x >= 0; x--){
            System.out.println(fruits[x]);
        }
    }

}
