import java.util.Scanner;
public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        repeat:
        while(true) {
            int num = sc.nextInt();
            if (num == 0)
                break repeat;
            System.out.println(num);
        }
    }
}
