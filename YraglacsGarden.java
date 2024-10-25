import java.util.Scanner;

public class YraglacsGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        int[][] field = new int[y][x];
        int availableFields = 0;

        for (int i = 0; i < y; i++) {
            String[] line = sc.nextLine().trim().split(" ");
            for (int j = 0; j < x; j++) {
               field[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (field[i][j] =< field[i-1][j] || field[i+1][j] || field[i][j-1] || field[i][j+1])
            }
         }
    }
}
