import java.util.Scanner;
public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] check = new int [23];
        int n = sc.nextInt();
        int num;

        for(int i = 0; i < n; i++) {
            num = sc.nextInt();
            check[num-1] += 1;
        }
        for (int i:check)
            System.out.print(i + " ");
    }
}
