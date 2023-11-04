import java.util.Scanner;
public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = 10000;

        while(num != 0) {
            System.out.println("[" + (num - num%div) + "]");
            num = num%div;
            div /= 10;
        }
    }
}
