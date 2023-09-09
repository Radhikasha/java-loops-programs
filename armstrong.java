import java.util.*;

public class armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.: ");
        int n = sc.nextInt();
        int org, rem, result = 0;
        org = n;
        while (org != 0) {
            rem = org % 10;
            result = result + (rem * rem * rem);
            org = org / 10;
        }
        if (result == n)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");

    }

}
