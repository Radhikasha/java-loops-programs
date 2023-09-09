import java.util.*;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if ((a >= 'a' && a <= 'z') || (a <= 'Z' && a >= 'A'))
            System.out.println("a is alphabet");

        else
            System.out.println(" a is not alphabet");

    }

}