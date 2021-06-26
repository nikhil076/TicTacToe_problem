package com.bridgelabz.tictactoe_problem;

import java.util.Random;
import java.util.Scanner;

import java.lang.reflect.Array;

public class TicTacToeGame {
	static boolean playerStarts;
	static char[] board = new char[10];
	public static int line;

	public static void main(String[] args) {
		printBoard();
		Scanner userInput = new Scanner(System.in);
		char userLetter = userSelection(userInput);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
		//int indexPosition = indexSelection(true);
		tossToStartFirst();
		if (playerStarts == true) {
			playerStartsFirst(computerLetter, userLetter);
		} else {
			computerStartsFirst(computerLetter, userLetter);
		}

	}

	private static void computerStartsFirst(char computerValue, char userValue) {
		for (int i = 1; i < board.length; i++) {
			if (i % 2 == 0) {
				int user_index = indexSelection(true);
				checkFreeSpace(user_index, userValue);
			} else {
				checkFreeSpaceComputer(computerValue);
			}
			String winner =winnerCheck(userValue, computerValue);
			if(!winner.equals(""))
			{
				System.out.println(winner);
				System.exit(0);
			}
		}
	}

	private static void playerStartsFirst(char computerValue, char userValue) {
		for (int i = 1; i < board.length; i++) {
			if (i % 2 == 0) {
				checkFreeSpaceComputer(computerValue);
			} else {

				int user_index = indexSelection(true);
				checkFreeSpace(user_index, userValue);
			}
			String winner =winnerCheck(userValue, computerValue);
			if(!winner.equals(""))
			{
				System.out.println(winner);
				System.exit(0);
			}
		}

	}

	public static char userSelection(Scanner userInput) {
		System.out.println("Choose the letter : ");
		return userInput.next().toUpperCase().charAt(0);
	}

	// To Print the whole Board of Game
	public static void printBoard() {
		System.out.println("|---|---|---|");
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		System.out.println("|---|---|---|");
	}

	public static int indexSelection(boolean spaceCheck) {
		int user_index_value;
		Scanner scanner = new Scanner(System.in);
		if (spaceCheck == true) {
			System.out.println("Enter the index value between 1 to 9");
			user_index_value = scanner.nextInt();
		} else {
			System.out.println("Index value is not empty");
			user_index_value = scanner.nextInt();
		}
		return user_index_value;
	}

	public static void checkFreeSpace(int user_selection, char player_value) {
		System.out.println(board[user_selection]);
		if (board[user_selection] == 0) {
			System.out.println(user_selection + " index is free");
			board[user_selection] = player_value;
			printBoard();
		} else {
			System.out.println(user_selection + " index is not free");
			indexSelection(false);
		}
	}

	public static void checkFreeSpaceComputer(char computer_value) {
		int random = (int) (Math.floor(Math.random() * 10) % 8) + 1;
		if (board[random] == 0) {
			board[random] = computer_value;
			printBoard();
		} else {
			checkFreeSpaceComputer(computer_value);
		}
	}

	public static void tossToStartFirst() {
		int player_choice = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("press '1' to toss to check who plays first ");
		int choice = scanner.nextInt();
		double headOrTails = Math.floor(Math.random() * 10) % 2;
		if (headOrTails == player_choice) {
			playerStarts = true;
			System.out.println("player starts first ");
		} else {
			playerStarts = false;
			System.out.println("Computer starts first ");
		}
	}
	public static String winnerCheck(char userValue, char computerValue)
	{
		System.out.println();
		if((Array.getChar(board, 1)==Array.getChar(board, 2)) && (Array.getChar(board, 2)==Array.getChar(board, 3)))
		{
			if(userValue == Array.getChar(board, 1))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 1))
			{
				return "Computer Wins";
			}
		}
		else if((Array.getChar(board, 4)==Array.getChar(board, 5)) && (Array.getChar(board, 5)==Array.getChar(board, 6)))
		{
			if(userValue == Array.getChar(board, 4))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 4))
			{
				return "Computer Wins";
			}
		}
		else if((Array.getChar(board, 7)==Array.getChar(board, 8)) && (Array.getChar(board, 8)==Array.getChar(board, 9)))
		{
			if(userValue == Array.getChar(board, 7))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 7))
			{
				return "Computer Wins";
			}
		}
		else if((Array.getChar(board, 1)==Array.getChar(board, 4)) && (Array.getChar(board, 4)==Array.getChar(board, 7)))
		{
			if(userValue == Array.getChar(board, 1))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 1))
			{
				return "Computer Wins";
			}
		}
		else if((Array.getChar(board, 2)==Array.getChar(board, 5)) && (Array.getChar(board, 5)==Array.getChar(board, 8)))
		{
			if(userValue == Array.getChar(board, 2))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 2))
			{
				return "Computer Wins";
			}
		}
		else if((Array.getChar(board, 3)==Array.getChar(board, 6)) && (Array.getChar(board, 6)==Array.getChar(board, 9)))
		{
			if(userValue == Array.getChar(board, 3))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 3))
			{
				return "Computer Wins";
			}
		}
		else if((Array.getChar(board, 1)==Array.getChar(board, 5)) && (Array.getChar(board, 5)==Array.getChar(board, 9)))
		{
			if(userValue == Array.getChar(board, 5))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 5))
			{
				return "Computer Wins";
			}
		}
		else if((Array.getChar(board, 3)==Array.getChar(board, 5)) && (Array.getChar(board, 5)==Array.getChar(board, 7)))
		{
			if(userValue == Array.getChar(board, 3))
			{
				return "Player Wins";
			}
			else if(computerValue == Array.getChar(board, 3))
			{
				return "Computer Wins";
			}
		}
		else 
		{
			return "Draw";
		}
		return "";
	}
}
