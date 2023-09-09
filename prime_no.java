import java.util.*;

public class prime_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.: ");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = true;
                break;

            }
        }
        if (!flag)
            System.out.println("it is prime number");
        else
            System.out.println("it is not prime number");
            

    }

}
