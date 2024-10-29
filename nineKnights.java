import java.util.Scanner;

public class nineKnights {

    public static boolean checkSurroundings(char[][] board, int i, int j){
        int[] rowOffsets = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] colOffsets = {-1, 1, -2, 2, -2, 2, -1, 1};

        int dimension = board.length;

        for (int k = 0; k < 8; k++) {
            int newRow = i + rowOffsets[k];
            int newCol = j + colOffsets[k];

            if (newCol >= 0 && newRow < dimension && newRow >= 0 && newCol < dimension) {
                if (board[newRow][newCol] == 'k') {
                    return false;
                }
            }   
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boardDimension = 5;
        char[][] board = new char[boardDimension][boardDimension];
        int knightCount = 0;

        for (int i = 0; i < boardDimension; i++){
            String row = scanner.nextLine();
            for (int j = 0; j < boardDimension; j++){
                board[i][j] = row.charAt(j);
                if (board[i][j] == 'k'){
                    knightCount++;
                }
            }
        }

        if (knightCount != 9) {
            System.out.print("invalid");
            scanner.close();
            return;
        }

        boolean isPossible = true;
        
        // Check if any knight can attack another knight
        for (int i = 0; i < boardDimension; i++) {
            for (int j = 0; j < boardDimension; j++) {
                if (board[i][j] == 'k' && !checkSurroundings(board, i, j)) {
                    isPossible = false;
                    break;
                }
            }
            if (!isPossible) break;
        }
        
        System.out.println(isPossible ? "valid" : "invalid");
        
        scanner.close();
    }
}