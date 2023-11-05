import java.util.Scanner;
public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a%2 == 0)
            System.out.println(a);
        if (b%2 == 0)
            System.out.println(b);
        if (c%2 == 0)
            System.out.println(c);
    }
}
