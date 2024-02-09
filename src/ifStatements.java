public class ifStatements {

    public static void main(String[] args) {
        // basic
        int temp = 32;
        if (temp > 30) {
            System.out.println("It is a hot day. Drink water!");
        }
        else if (temp > 20) {
            System.out.println("Great day :)");
        }
        else {
            System.out.println("Cold day.");
        }

        // simplified
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
    }

}
