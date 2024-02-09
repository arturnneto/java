public class logicalOperators {
    public static void main(String[] args) {
        // basics
        int x = 1;
        int y = 1;
        System.out.println(x == y); // <= > < etc
        System.out.println(x != y);

        // logical operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean highHorsepower = true;
        boolean manualTransmission = true;
        boolean isFun = highHorsepower || manualTransmission;
        System.out.println(isFun);

        boolean unreliable = true;
        boolean automatic = true;
        boolean shouldBuy = !unreliable && !automatic;
        System.out.println(shouldBuy);
    }
}
