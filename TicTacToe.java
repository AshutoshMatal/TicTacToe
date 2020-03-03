import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
static ArrayList<Integer> playerPositions=new ArrayList<Integer>();
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
//
public static String checkWin()
{
	List topRow=Arrays.asList(1, 2, 3);
	List middleRow=Arrays.asList(4, 5, 6);
	List bottomRow=Arrays.asList(7, 8, 9);
	List firstCol=Arrays.asList(1, 4, 7);
	List middleCol=Arrays.asList(2, 5, 8);
	List lastCol=Arrays.asList(3, 6, 9);
	List cross1=Arrays.asList(1, 5, 9);
	List cross2=Arrays.asList(3, 5, 7);
	
	List <List>winposition=new ArrayList<List>();
	winposition.add(topRow);
	winposition.add(middleRow);
	winposition.add(bottomRow);
	winposition.add(firstCol);
	winposition.add(middleCol);
	winposition.add(lastCol);
	winposition.add(cross1);
	winposition.add(cross2);
	for(List l:winposition)
	{
		if(playerPositions.containsAll(l))
		{
			return "Congratulations you WON!!!!!!!";
		}
	}
	return "";
	
}
void placePieace(char[][]gameboard,int position,String user)
{   
	char Symbol='X';
	if(user.equals(player));
	{
	Symbol='X';
	playerPositions.add(position);
	}
	//TO SET A POSITION ON THE BOARD
	  switch(position)
	  {
	  case 1:
		  gameboard[0][0]=Symbol;
		  break;
	  case 2:
		  gameboard[0][2]=Symbol;
		  break;
	  case 3:
		  gameboard[0][4]=Symbol;
		  break;
	  case 4:
		  gameboard[2][0]=Symbol;
		  break;
	  case 5:
		  gameboard[2][2]=Symbol;
		  break;
	  case 6:
		  gameboard[2][4]=Symbol;
		  break;
	  case 7:
		  gameboard[4][0]=Symbol;
		  break;
	  case 8:
		  gameboard[4][2]=Symbol;
		  break;
	  case 9:
		  gameboard[4][4]=Symbol;
		  break;
	  default:
		  break;
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
	while(true)
	{
	System.out.println("Enter the number (1-9):");
	 int position=sc.nextInt();
	// System.out.println(position);
	 
	  tt.placePieace(gameboard,position,"player");
	  tt.resetBoard(gameboard);
	  String result=checkWin();
	  System.out.println(result);
	  }
	}
}
