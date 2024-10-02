import java.util.Scanner;

/**
 * Write a description of class tic_tac_toe here.
 *
 * @author (Hassan Talha)
 * @version (3/22/23)
 */
public class tic_tac_toe
{
    public static void main(String[] args) {
        int boardSize = 3;
        char fill = '-';
        char playerX = 'X';
        char playerO = 'O';

        char[][] board = new char[boardSize][boardSize];

        
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = fill;
            }
        }

        
        displayBoard(board);

        char currentPlayer = playerX;
        boolean gameEnded = false;

            while (!gameEnded) {
            Scanner scanner = new Scanner(System.in);
            int r, c;
            do {
                System.out.println(currentPlayer + "'s turn.");
                System.out.println("Enter row (1-" + boardSize + "): ");
                r = scanner.nextInt() - 1;
                System.out.println("Enter column (1-" + boardSize + "): ");
                c = scanner.nextInt() - 1;

                if (r < 0 || r >= boardSize || c < 0 || c >= boardSize) {
                    System.out.println("Invalid input");
                } else if (board[r][c] != fill) {
                    System.out.println("This spot is already taken");
                } else {
                    board[r][c] = currentPlayer;
                    break;
                }
            } while (true);
            displayBoard(board);
            if (isWinner(board, currentPlayer)) {
                System.out.println(currentPlayer + " wins!");
                gameEnded = true;
            } 
            else {      
                if (isCat(board)) {
                    System.out.println("It’s a TIE!");
                    gameEnded = true;
                } 
            else if (currentPlayer == playerX) {
                        currentPlayer = playerO;
                    }
            else {
                        currentPlayer = playerX;
                    }
                }
            }
        }
        public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isWinner(char[][] board, char player) {
        int boardSize = board.length;

        // Check rows and columns
        for (int i = 0; i < boardSize; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; 
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; 
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; 
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; 
        }

       
        return false;
    }
    public static boolean isCat(char[][] board) {
        int boardSize = board.length;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] == '-') {
                    return false; 
                }
            }
        }

        
        return !isWinner(board, 'X') && !isWinner(board, 'O');
    }
}


