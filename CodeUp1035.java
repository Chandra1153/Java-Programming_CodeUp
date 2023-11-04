import java.util.Scanner;
public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        System.out.println(Integer.toString(Integer.parseInt(num, 16), 8));
    }
}
