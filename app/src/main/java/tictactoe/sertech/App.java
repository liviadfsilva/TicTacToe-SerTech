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

        // Game on
        boolean game = true;
        while(game){
            System.out.println("Type a position: ");
            System.out.println();

            int lineChosen = scanner.nextInt();
            int rowChosen = scanner.nextInt();

            board[lineChosen][rowChosen] = 'X';

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