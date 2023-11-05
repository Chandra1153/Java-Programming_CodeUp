import java.util.Scanner;
public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alp;

        do {
            alp = sc.next().charAt(0);
            System.out.println(alp);
        } while (alp != 'q');
    }
}
