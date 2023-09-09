import java.util.*;

public class max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        if (a > b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");

    }
}