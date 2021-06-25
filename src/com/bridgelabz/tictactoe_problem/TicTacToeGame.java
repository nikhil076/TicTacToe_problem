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
		System.out.println("press select x or o");
		char user_input = scanner.next().charAt(0);
		char x_value ='x';
		char o_value ='o';
		char player =' ';
		char computer = ' ';
		
			if(user_input == x_value)
			{
				player =x_value;
				System.out.println("Player :"+player);
				computer=o_value;
				System.out.println("Computer :"+computer);
			}
			else if(user_input == o_value)
			{
				player = o_value;
				System.out.println("Player :"+player);
				computer= x_value;
				System.out.println("Compuer :"+computer);
			}
			else
				System.out.println("Invalid input");
	} 
}
