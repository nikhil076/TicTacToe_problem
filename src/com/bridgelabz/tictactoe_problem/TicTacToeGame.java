package com.bridgelabz.tictactoe_problem;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args)
	{
		initializeBoard();
		userSelection();
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
	
	public static void userSelection() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("press '1' to select x aand press '2' to select o");
		int user_input = scanner.nextInt();
		String player ="";
		String computer ="";
		
			if(user_input == 1)
			{
				player ="x";
				System.out.println("Player :"+player);
				computer="o";
				System.out.println("Computer :"+computer);
			}
			else if(user_input == 2)
			{
				player = "o";
				System.out.println("Player :"+player);
				computer="x";
				System.out.println("Compuer :"+computer);
			}
			else
				System.out.println("Invalid input");
	} 
}
