import java.util.*;

public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 5 == 0 && a % 11 == 0)
            System.out.println("a is divisible by 5 and 11");

        else
            System.out.println(" a is not divisible by 5 and 11");
    }

}
