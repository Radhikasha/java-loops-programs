import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 0;
        int add = 0, a;
        int i = 1;
        while (n != 0) {
            a = n % 10;
            add = add + a;
            n = n / 10;

        }

        System.out.println(add);

    }

}
