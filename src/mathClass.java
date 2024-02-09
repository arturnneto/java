public class mathClass {
    public static void main(String[] args) {

        float number = 5.5F;
        int result = Math.round(number);
        int result2 = (int)Math.ceil(number);
        int result3 = (int)Math.floor(number);
        int result4 = Math.max(5, 10);
        int result5 = Math.min(5, 10);
        double result6 = Math.random() * 100;
        int result7 = (int)(Math.random() * 100);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);


    }
}
