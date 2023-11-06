import java.util.Scanner;
public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] check = new int [n];

        for(int i = n-1; i >= 0; i--) {
            check[i] = sc.nextInt();
        }
        for (int i:check)
            System.out.print(i + " ");
    }
}
