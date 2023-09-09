import java.util.*;

public class strong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.: ");
        int n = sc.nextInt();
        int i, p, r, org, sum = 0;
        org = n;
        while (org != 0) {
            i = 1;
            p = 1;
            r = org % 10;
            while (i <= r) {
                p = p * i;
                i++;
            }
            sum = sum + p;
            org = org / 10;
        }
        if (sum == org)
            System.out.println("strong number");
        else
            System.out.println("not strong number");
    }

}
