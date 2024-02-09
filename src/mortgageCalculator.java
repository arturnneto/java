import java.text.NumberFormat;
import java.util.Scanner;


public class mortgageCalculator {
    public static void main(String[] args) {
        // Create constants for months in a year and percentage conversion
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Create Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Store values read on input
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        float monthlyRate = ((scanner.nextFloat()) / PERCENT / MONTHS_IN_YEAR);

        System.out.print("Period (Years): ");
        int period = (scanner.nextInt()) * MONTHS_IN_YEAR;

        // Calculates the mortgage result
        double pow = Math.pow(1+monthlyRate, period);
        double upperPart = (monthlyRate*pow);
        double lowerPart = (pow - 1);
        double result = (principal * (upperPart / lowerPart));

        // Format the result to a currency format
        String mortgageReturn = NumberFormat.getCurrencyInstance().format(result);

        System.out.println("Mortgage: " + mortgageReturn);
    }
}
