import java.util.Scanner;
public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] omok = new int[19][19];
        int n = sc.nextInt();
        int x,y;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            omok[x-1][y-1] = 1;
        }
        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {
                System.out.print(omok[i][j]);
                if(j == 18)
                    System.out.print("\n");
                else
                    System.out.print(" ");
            }
        }
    }
}
