import java.util.*;

public class power {
    public static void main(String[] args) {
        int base, exponent, expo;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base: ");
        base = sc.nextInt();
        System.out.println(" enter exponent: ");
        exponent = sc.nextInt();
        expo = exponent;
        long pow = 1;
        while (exponent != 0) {
            pow = pow * base;
            --exponent;
        }
        System.out.println(base + "to the power" + expo + "is" + pow);

    }

}
