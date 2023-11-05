import java.util.Scanner;
public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        repeat:
        while(true) {
            if (n-- == 0)
                break repeat;
            int num = sc.nextInt();
            System.out.println(num);
        }
    }
}
