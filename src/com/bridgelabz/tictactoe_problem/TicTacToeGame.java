package com.bridgelabz.tictactoe_problem;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args)
	{
		initializeBoard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = userSelection(userInput);
		char computerLetter =(userLetter =='X') ? 'O' : 'X';
		
		System.out.println("User Letter is :"+userLetter+" \nComputer Letter is :"+computerLetter);
	}
	
	public static void initializeBoard() 
	{
	char[] board = new char[10];
		for(int index =1;index<board.length;index++)
		{
			if(index%3!=0)
			{
				board[index]='-';
				System.out.print(board[index]);
			}
			else
			{
				board[index]='-';
				System.out.print(board[index]);
				System.out.println();
			}
		}
  	}
	
	public static char userSelection(Scanner userInput) 
	{
		System.out.println("Choose the letter : ");
		return userInput.next().toUpperCase().charAt(0);
	}
}
