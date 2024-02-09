public class strings {

    public static void main(String[] args) {

        // string methods
        String message = "Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf('W'));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println(message.replace('W', 'S'));
        System.out.println(message);

        System.out.println("\n"); // \n => new line, \t => new tab
        // escape sequences
        String message2 = "Hello \"World\"";
        System.out.println(message2);

    }
}
