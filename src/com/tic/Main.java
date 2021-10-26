package com.tic;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		int turn =  0;
		int winner = -1;
		int[] board = new int[9];
		for (int i = 0; i < board.length; i++) {
			board[i] = -1;
			}
		while(winner == -1) {
			
			winner = checkWinner(board);
			}
		printBoard(board);
	}
	
	public static int checkWinner(int[] board) {
		int winner = -1;
		
		if(board[0] == board[1] && board[0] == board[2] && board[0] != -1){ 
				winner = board[0];
		}
		else if (board[3] == board[4] && board[3] == board[5] && board[3] != -1) {
			winner = board[3];
		}
		return winner;
	}

	public static void printBoard(int[] meinBoard) {
		System.out.println("-------------");
		System.out.println(meinBoard[0] + " | " + meinBoard[1] + " | " + meinBoard[2]);
		System.out.println("-------------");
		System.out.println(meinBoard[3] + " | " + meinBoard[4] + " | " + meinBoard[5]);
		System.out.println("-------------");
		System.out.println(meinBoard[6] + " | " + meinBoard[7] + " | " + meinBoard[8]);
		System.out.println("-------------");
		
	}

}
