import java.util.Scanner;
public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] maze = new int[10][10];

        for(int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                maze[i][j] = sc.nextInt();

        int pos = 1;
        end:
        for(int i = 1; i < 10; i++) {
            for (int j = pos; j < 10; j++) {
                if (j < 9 && maze[i][j+1] == 1 && maze[i+1][j] == 1) {
                    maze[i][j] = 9;
                    break end;
                }
                if (maze[i][j] == 0) maze[i][j] = 9;
                else if (maze[i][j] == 2) {
                    maze[i][j] = 9;
                    break end;
                }
                else {
                    pos = j-1;
                    break;
                }
            }
        }
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(maze[i][j]);
                if(j == 9) System.out.print("\n");
                else System.out.print(" ");
            }
        }
    }
}
