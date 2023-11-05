import java.util.Scanner;
public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alp = sc.next().charAt(0);
        int num = 97;

        while(num != (int)alp + 1) {
            System.out.print((char)(num++) + " ");
        }
    }
}
