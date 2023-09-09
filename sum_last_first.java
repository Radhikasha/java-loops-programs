import java.util.*;

public class sum_last_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstdigit = 0;
        int lastdigit = 0;
        lastdigit = n % 10;
        System.out.println("last digit: " + lastdigit);
        while (n != 0) {
            firstdigit = n % 10;
            n /= 10;
        }
        System.out.println("first digit: " + firstdigit);
        int add = lastdigit + firstdigit;
        System.out.println("last digit + first digit: " + add);

    }

}
