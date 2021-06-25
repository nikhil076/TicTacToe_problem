package com.bridgelabz.tictactoe_problem;

public class TicTacToeGame {

	public static void main(String[] args)
	{
		initializeBoard();
	}
	
	public static void initializeBoard() 
	{
		char[] Board = new char[10];
			for(int i =1;i<Board.length;i++)
			{
				if(i%3!=0)
				{
					Board[i]='-';
					System.out.print(Board[i]);
				}
				else
				{
					Board[i]='-';
					System.out.print(Board[i]);
					System.out.println();
				}
			}
  	}
}
