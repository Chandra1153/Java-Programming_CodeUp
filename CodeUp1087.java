import java.util.Scanner;
public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0, sum = 0;

        while(true) {
            sum += ++i;
            if(num <= sum) {
                System.out.println(sum);
                break;
            }
        }
    }
}
