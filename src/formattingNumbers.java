import java.text.NumberFormat;

public class formattingNumbers {
    public static void main(String[] args) {
        // currency formatting
        // NumberFormat currency = new NumberFormat(); --> impossible
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.890);
        System.out.println(result);

        System.out.println();
        // percentage formatting
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String percentageResult = percentage.format(123);
        System.out.println(percentageResult);

        // another way to do it
        String anotherWay = NumberFormat.getPercentInstance().format(456);
        System.out.println(anotherWay);
    }
}
