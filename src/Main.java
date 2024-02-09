import javax.xml.crypto.Data;
import java.awt.*;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // primitive types
        byte age = 30;
        int temperature = 30;
        int viewsCount = 1234567890;
        long longViewsCount = 123456789012L;
        double longDecimalValue = 12.31;
        float price = 10.99F;
        // byte < short < int < long

        char letter = 'A';
        String name = "Artur Jorge Amorim Neto";
        boolean isMyName = true;
        System.out.println(age);

        System.out.println();
        // constants
        final float PI = 3.14F;
        System.out.println(PI);


        System.out.println();
        // reference types
        Date now = new Date();
        now.getTime();
        System.out.println(now);

        System.out.println();
        // reference types versus primitive types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(x);
        System.out.println(y);

        System.out.println();
        // pointers
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);


    }
}