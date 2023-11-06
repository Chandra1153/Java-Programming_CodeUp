import java.util.Scanner;
public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        while(--n > 0)
            a += d;
        System.out.println(a);
    }
}
