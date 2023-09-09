import java.util.*;

public class special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if ((a >= 'a' && a <= 'z') || (a <= 'Z' && a >= 'A'))
            System.out.println(" a is alphabet");
        else if (a >= '0' && a <= '9')
            System.out.println("a is digit");
        else
            System.out.println(" a is special character");

    }

}
