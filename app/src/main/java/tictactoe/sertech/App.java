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

            // Victory Check
            boolean hasWinner = false;
            boolean hasEmpty = false;

            for (int i = 0; i < board.length; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                    System.out.println(board[i][0] + " wins!");
                    hasWinner = true;
                }
                if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                    System.out.println(board[0][i] + " wins!");
                    hasWinner = true;
                }
            }

            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
                System.out.println(board[0][0] + " wins!");
                hasWinner = true;
            }

            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
                System.out.println(board[0][2] + " wins!");
                hasWinner = true;
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == ' ') {
                        hasEmpty = true;
                    }
                }
            }

            if (!hasWinner && !hasEmpty) {
                System.out.println("Stalemate.");
            }
                    
        }
        scanner.close();
    }
}