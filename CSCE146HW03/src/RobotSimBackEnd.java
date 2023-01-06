/*
 * Harshil Shah
 */

import java.io.*;
import java.util.*;

public class RobotSimBackEnd implements QueueI <String> {
	
	public static final int Size = 10;
	private char board[][];
	private LLQueue<String> aMove; //create a linked list type string
	
	public RobotSimBackEnd() {
		board = new char [Size][Size];
		aMove = new LLQueue<String>();
	}
	
	public void printInitial(String fileName) 
	{
		try
		{
			Scanner reader = new Scanner(new File(fileName));
			for(int i=0; i<Size;i++) {
				board[i] =	reader.nextLine().toCharArray();
				board [0][0] = 'O';
				System.out.println(board[i]);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void printBoard() 
	{
		//print the board using for loop and use and make sure i is less than 10(constant)
		for(int i=0; i<Size;i++) 
		{
			System.out.println(board[i]);
		}
	}
	
	public boolean check(int i, int j, char board[][]) 
	{
		//check if the moves are valid adn the board is good to go
		if(i >= 0 && j >= 0 && i < Size && j < Size && board[i][j] == '_') {
			return true;
		}
		else
		{//if the board is not good to go then crash 
			System.out.println("CRASH!");
			System.exit(0);
			return false;
		}
	}
	
	public void mMOve(String secondFileName) {
		
		int count = 0;
		int locY = 0;
		int locX = 0;
		
		try
		{
			Scanner command = new Scanner(new File(secondFileName));
			while(command.hasNext()) 
			{
				String move = command.nextLine();
				aMove.enqueue(move);
				if(aMove.peek().equals("Move Up")) 
				{
					System.out.println("\n command "+ count);
					if(check(locY-1, locX, board))
					{
						board[locY][locX] = '_';
						board[locY-1][locX] = 'O';
						locY -= 1;
						printBoard();
						aMove.dequeue();
						count++;
					}
				}
				else if(aMove.peek().equals("Move Down"))
				{
					System.out.println("\n command "+ count);
					if(check(locY+1, locX, board))
					{
						board[locY][locX] = '_';
						board[locY+1][locX] = 'O';
						locY += 1;
						printBoard();
						aMove.dequeue();
						count++;
					}
				}
				else if(aMove.peek().equals("Move Right"))
				{
					System.out.println("\n command "+ count);
					if(check(locY, locX+1, board))
					{
						board[locY][locX] = '_';
						board[locY][locX+1] = 'O';
						locX += 1;
						printBoard();
						aMove.dequeue();
						count++;
					}
				}
				else if(aMove.peek().equals("Move Left"))
				{
					System.out.println("\n command "+ count);
					if(check(locY, locX-1, board))
					{
						board[locY][locX] = '_';
						board[locY][locX-1] = 'O';
						locX -= 1;
						printBoard();
						aMove.dequeue();
						count++;
					}
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void enqueue(String aData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
