import java.util.Scanner;
public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] omok = new int[19][19];

        for(int i = 0; i < 19; i++)
            for(int j = 0; j < 19; j++)
                omok[i][j] = sc.nextInt();

        int n = sc.nextInt();
        int x,y;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                if(omok[x-1][j] == 0) omok[x-1][j] = 1;
                else omok[x-1][j] = 0;
            }
            for (int j = 0; j < 19; j++) {
                if(omok[j][y-1] == 0) omok[j][y-1] = 1;
                else omok[j][y-1] = 0;
            }
        }

        for(int i = 0; i < 19; i++) {
            for(int j = 0; j < 19; j++) {
                System.out.print(omok[i][j]);
                if(j == 18) System.out.print("\n");
                else System.out.print(" ");
            }
        }
    }
}
