import java.util.*;

public class frequency_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp, a;
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            temp = n;

            while (temp > 0) {
                a = temp % 10;
                if (a == i) {
                    count++;
                }
                temp = temp / 10;
            }
            if (count > 0)
                System.out.println(i + "\t" + count);
        }

    }

}
