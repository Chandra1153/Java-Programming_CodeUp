import java.util.Scanner;
public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.next().split("\\.");
        int y = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        int d = Integer.parseInt(time[2]);

        System.out.printf("%04d.%02d.%02d", y, m, d);
    }
}
