package com.bridgelabz.tictactoe_problem;

public class TicTacToeGame {

	public static void main(String[] args) {
		initializeBoard();
	}
	
	public static void initializeBoard() {
		char[][] Board = new char[3][3];
		for(int i =0;i<Board.length;i++)
		{
			for(int j=0;j<Board[0].length;j++)
			{
				Board[i][j]='-';
				System.out.print(Board[i][j]);
			}
			System.out.println();
		}
  	}
}
