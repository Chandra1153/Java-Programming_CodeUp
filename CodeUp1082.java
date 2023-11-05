import java.util.Scanner;
public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        for (int i = 1; i < 16; i++) {
            System.out.println(num + "*" + Integer.toString(i, 16).toUpperCase() +
                    "=" + Integer.toString(Integer.parseInt(num, 16)*i, 16).toUpperCase());

        }
    }
}
