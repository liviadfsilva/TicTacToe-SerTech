package tictactoe.sertech;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Board
        char[][] board = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("[ " + board[i][j] + " ] ");
            }
            System.out.println();
            System.out.println();
        }

        // Turn
        int whoseTurn = 0;

        // Game on
        boolean game = true;
        while(game){
            System.out.println("Type a position: ");
            System.out.println();

            int lineChosen = scanner.nextInt();
            int rowChosen = scanner.nextInt();

            if(whoseTurn == 0 && board[lineChosen][rowChosen] == ' '){
                board[lineChosen][rowChosen] = 'X';
                whoseTurn++;
            }
            else if(whoseTurn == 1 && board[lineChosen][rowChosen] == ' '){
                board[lineChosen][rowChosen] = 'O';
                whoseTurn--;
            }
            else{
                System.out.println("Invalid option.");
            }

            System.out.println();

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print("[ " + board[i][j] + " ] ");
                }
            System.out.println();
            System.out.println();
            }
        }

        scanner.close();

    }
}