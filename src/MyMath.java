import java.util.Scanner;

public class MyMath {

    public static int gcf(int a, int b) {

        int c = 0;

        while(b != 0) {
            if (a > b) {
                c = b;
                b = a % b;
                a = c;
            }
            else if (!(a >b)) {
                b = b%a;
            }



        }
        return(a);

    }
    public static void main(String[] args) {

        System.out.println(gcf(42, 21));
    }
}
