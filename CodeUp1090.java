import java.util.Scanner;
public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        while(--n > 0)
            a *= r;
        System.out.println(a);
    }
}
