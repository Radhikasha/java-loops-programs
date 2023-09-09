import java.util.*;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d = %d\n", n, i, n * i);
        }
    }

}
