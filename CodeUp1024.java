import java.util.Scanner;
public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            System.out.println("'" + word.substring(i, i+1) + "'");
        }
    }
}
