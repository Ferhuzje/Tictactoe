package com.tic;

import java.util.Scanner;

public class Player {

    int number;
    Scanner scanner = new Scanner(System.in);

    //Konstruktor

    public Player(int number) {
        this.number = number;
        }

    public int getTurn() {
        System.out.println("Player " + number + " - Du bist am Zug");
        int input = scanner.nextInt();
        if(input < 9 && input >= 0) {
            return input;
        }
        System.out.println("Ungültige Eingabe. Bitte noch einmal probieren");

        //Rekursion
        return getTurn();
    }

    public boolean validateTurn(int[] board, int turn) {
       if(board[turn] == -1) {
        return true;
        }
        return false;
    }
  
}
