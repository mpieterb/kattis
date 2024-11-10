import java.util.Scanner;

public class TwoZeroFourEight {

    // Calculates the sum of pairs in the array
    public static void calculateArray(int[][] array, int direction) {
        if (direction == 0 || direction == 3){
            // Merge to the left
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[i][j] == array[i][j+1]){
                        array[i][j] *= 2;
                        array[i][j+1] = 0;
                        j++;
                    }
                }
            }
        } else if (direction == 1 || direction == 2) {
            // Merge to the right
            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 1; j >= 1; j--) {
                    if (array[i][j] == array[i][j-1]){
                        array[i][j] *= 2;
                        array[i][j-1] = 0;
                        j--;
                    }
                }
            }
        }
    }

    // Helper method to shift non-zero elements left or right in a row
    public static void shiftArray(int[][] array, int direction) {
        int numRows = array.length;
    
        // Determine the actual direction based on the given value
        boolean moveRight = (direction == 1 || direction == 2);
    
        // Process each row independently
        for (int row = 0; row < numRows; row++) {
            int numCols = array[row].length;
            int index = moveRight ? numCols - 1 : 0;
    
            // Move non-zero elements to the target position within the row
            for (int col = moveRight ? numCols - 1 : 0; moveRight ? col >= 0 : col < numCols; col += moveRight ? -1 : 1) {
                if (array[row][col] != 0) {
                    array[row][index] = array[row][col];
                    index += moveRight ? -1 : 1;
                }
            }
    
            // Fill remaining elements with zeroes in the row
            while (moveRight ? index >= 0 : index < numCols) {
                array[row][index] = 0;
                index += moveRight ? -1 : 1;
            }
        }
    }

    // Rotates the matrix clockwise to prepare for up/down
    public static int[][] rotateCW(int[][] board) {
        final int M = board.length;
        final int N = board[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[c][M-1-r] = board[r][c];
            }
        }
        return ret;
    }

    // Rotates the matrix counter clockwise after up/down
    public static int[][] rotateCCW(int[][] board) {
        final int M = board.length;
        final int N = board[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[N - 1 - c][r] = board[r][c];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int direction = sc.nextInt();
        sc.close();

        switch (direction) {
            case 0:
            shiftArray(board, direction);
            calculateArray(board, direction);
            shiftArray(board, direction);
            break;
            case 1:
            board = rotateCW(board);
            shiftArray(board, direction);
            calculateArray(board, direction);
            shiftArray(board, direction);
            board = rotateCCW(board);
                break;
            case 2:
            shiftArray(board, direction);
            calculateArray(board, direction);
            shiftArray(board, direction);
                break;
            case 3:
            board = rotateCW(board);
            shiftArray(board, direction);
            calculateArray(board, direction);
            shiftArray(board, direction);
            board = rotateCCW(board);   
                break;
            default:
                break;    
        }
        for (int[] row : board) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }    
    }
}