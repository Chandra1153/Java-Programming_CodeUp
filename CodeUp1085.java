import java.util.Scanner;
public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();

        double result = h*b*c*s/1024/1024/8;
        System.out.printf("%.1f MB\n", result);
    }
}
