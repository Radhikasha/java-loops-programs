import java.util.Scanner;

public class product_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 0;
        int mult = 1, a;
        int i = 1;
        while (n != 0) {
            a = n % 10;
            mult = mult * a;
            n = n / 10;

        }

        System.out.println(mult);

    }

}
