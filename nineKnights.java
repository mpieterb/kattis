import java.util.Scanner;

public class nineKnights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boardDimension = 5;
        char[][] board = new char[boardDimension][boardDimension];

        for (int i = 0; i < boardDimension; i++){
            String row = scanner.nextLine();
            System.out.println(board[i]);
            for (int j = 0; j < boardDimension; j++){
                board[i][j] = row.charAt(j);
                // if ()\



            }
        }
        scanner.close();
    }
}
