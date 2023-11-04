import java.util.Scanner;
public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] day = sc.next().split("\\.");

        System.out.println(day[2] + "-" + day[1] + "-" + day[0]);
    }
}
