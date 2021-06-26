package com.bridgelabz.tictactoe_problem;

import java.util.Scanner;


public class TicTacToeGame
{
	static char[] board = new char[10];
	public static void main(String[] args)
	{
		initializeBoard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = userSelection(userInput);
		char computerLetter =(userLetter =='X') ? 'O' : 'X';
		
		System.out.println("User Letter is :"+userLetter+" \nComputer Letter is :"+computerLetter);
		printBoard();
//		int user_index = indexSelection(userInput);
//		System.out.println("the selected user index is :"+user_index);
		int user_index = indexSelection();
		checkFreeSpace(user_index,userLetter);
		
	}
	
	public static void initializeBoard() 
	{
	char[] board = new char[10];
		for(int index =1;index<board.length;index++)
		{
			if(index%3!=0)
			{
				board[index]='-';
			}
			else
			{
				board[index]='-';
				System.out.println();
			}
		}
  	}
	//To select X or O for User and Computer
	public static char userSelection(Scanner userInput) 
	{
		System.out.println("Choose the letter : ");
		return userInput.next().toUpperCase().charAt(0);
	}
	//To Print the whole Board of Game
	public static void printBoard()
	{
		System.out.println("|---|---|---|");
        System.out.println("| " + board[1] + " | "
                           + board[2] + " | " + board[3]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | "
                           + board[5] + " | " + board[6]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | "
                           + board[8] + " | " + board[9]
                           + " |");
        System.out.println("|---|---|---|");
	}
	public static int indexSelection() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the index value between 1 to 9");
		int user_index_value = scanner.nextInt();
		return user_index_value;
	}
	public static void checkFreeSpace(int user_selection, char Player_value)
	{
		if(board[user_selection]==0)
		{
			System.out.println(user_selection+" index is free");
			board[user_selection] = Player_value;
			printBoard();
		}
		else
		{
			System.out.println(user_selection+" index is not free");
		}
	}
}
