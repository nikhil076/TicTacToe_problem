package com.bridgelabz.tictactoe_problem;

public class TicTacToeGame {

	public static void main(String[] args)
	{
		initializeBoard();
	}
	
	public static void initializeBoard() 
	{
		char[] Board = new char[9];
			for(int i =0;i<Board.length;i++)
			{
					Board[i]='-';
					System.out.print(Board[i]);	
			}
  	}
}
