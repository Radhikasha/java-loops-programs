import java.util.*;

public class swap_1_2_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int temp;
        int firstdigit = 0;
        int lastdigit = 0;
        lastdigit = n % 10;
        while (n != 0) {
            firstdigit = n % 10;
            n /= 10;
        }
        System.out.println("first digit = " + firstdigit);
        System.out.println("last digit = " + lastdigit);
        System.out.println("after swap values");
        temp = firstdigit;
        firstdigit = lastdigit;
        lastdigit = temp;
        System.out.println("first digit = " + firstdigit);
        System.out.println("last digit = " + lastdigit);

    }

}
