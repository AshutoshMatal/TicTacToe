import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TicTacToe {
//VARIABLES
	String player;
	String Letter;
	String Computer;
	String toss;
	int num_Of_row=3;
	int num_Of_cols=3;	
	// ASSIGING A LETTER  X AND O 
	void assignLetter()
	{
		if(Letter=="X")
		{
			player="X";
			Computer="O";
		}
		else
		{
			player="O";
			Computer="X";
		}
		System.out.println("player   : "+player);
		System.out.println("Computer : "+Computer);
	}
	//  TOSS AND WHO WILL PLAY FIRST
void toss()
{
	if(toss=="X")
	{
		System.out.println("Player will  play first :"+player);
	}
	else
	{
		System.out.println("Computer will play first :"+Computer);
	}
}
	// PLAYER WOULD SEE THE BOARD AND CHOICE THE VALID CELL 
public  void resetBoard(char[][]gameboard)
{	
	for(char[]row:gameboard)
	{
		for (char c :row)
		{
			System.out.print(c);
		}
		System.out.println();
	}		
}
public static void main(String[] args)
{
	System.out.println("Welcome to TicTacToe");
	TicTacToe tt=new TicTacToe();
	tt.assignLetter();
	tt.toss();
	char[][]gameboard={
			 	{' ', '|',' ','|',' '},
				{'_','+','_','+','_'},
				{' ', '|',' ','|',' '},
				{'_','+','_','+','_'},
				{' ', '|',' ','|',' '}
			};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number (1-9):");
	 int position=sc.nextInt();
	 System.out.println(position);
	 //TO SET A POSITION ON THE BOARD
	  switch(position)
	  {
	  case 1:
		  gameboard[0][0]='X';
		  break;
	  case 2:
		  gameboard[0][2]='X';
		  break;
	  case 3:
		  gameboard[0][4]='X';
		  break;
	  case 4:
		  gameboard[2][0]='X';
		  break;
	  case 5:
		  gameboard[2][2]='X';
		  break;
	  case 6:
		  gameboard[2][4]='X';
		  break;
	  case 7:
		  gameboard[4][0]='X';
		  break;
	  case 8:
		  gameboard[4][2]='X';
		  break;
	  case 9:
		  gameboard[4][4]='X';
		  break;
	  } 
	  tt.resetBoard(gameboard);
	}

}
