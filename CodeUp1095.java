import java.util.Scanner;
public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] check = new int [n];

        for(int i = 0; i < n; i++) {
            check[i] = sc.nextInt();
        }
        int min = 24;
        for (int i:check)
            if (min > i)
                min = i;
        System.out.print(min);
    }
}
