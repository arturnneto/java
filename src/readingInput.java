import java.util.Scanner;

public class readingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("Hello " + name + " you are " + age);
    }
}
