import java.util.*;

public class sum_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }

}
