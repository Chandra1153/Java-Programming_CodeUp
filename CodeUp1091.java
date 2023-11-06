import java.util.Scanner;
public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        while(--n > 0)
            a = a*m+d;
        System.out.println(a);
    }
}
