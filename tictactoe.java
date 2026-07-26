import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char player = 'X';
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printboard(board);
            System.out.println("Player " + player + ", enter your move (row and column): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter numbers only!");
                scanner.nextLine(); // clear bad input
                continue;
            }
            int row = scanner.nextInt();

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter numbers only!");
                scanner.nextLine();
                continue;
            }
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid move! Enter row and column between 0-2");
                continue;
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;

                if (checkwinner(board, player)) {
                    printboard(board);
                    System.out.println("Player " + player + " wins!");
                    break;
                }

                if (isboardfull(board)) {
                    printboard(board);
                    System.out.println("It's a draw!");
                    break;
                }

                player = (player == 'X') ? 'O' : 'X';

            } else {
                System.out.println("Cell already occupied! Try again.");
            }
        }
        scanner.close();
    }

    public static void printboard(char[][] board) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    static boolean checkwinner(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }

    static boolean isboardfull(char[][] board) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ') return false;
        return true;
    }
}