import java.util.*;

public class uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a <= 'Z' && a >= 'A')
            System.out.println(" a is uppercase");

        else
            System.out.println(" a is lowercase");

    }

}
