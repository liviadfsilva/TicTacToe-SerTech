package tictactoe.sertech;

public class App {
    public static void main(String[] args) {
        
        // Board
        String[][] board = { {" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("[ " + board[i][j] + " ] ");
            }
            System.out.println();
            System.out.println();
        }
    }
}