
public class TicTacToe {
//VARIABLES
	String player;
	String Letter;
	String Computer;
	String toss;
// METHOD FOR rESETTING THE BOARD
	void resetBoard()
	{	System.out.println(" "+"__"+"  "+"__"+"  "+"__");
		for(int row=1;row<=3;row++)
		{
			for(int column=1;column<=3;column++)
			{ 
				System.out.print("|");
				System.out.print("__");
				System.out.print("|");
			}
			System.out.println("");	
		}
	}
	
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
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		TicTacToe tt=new TicTacToe();
		tt.assignLetter();
		tt.toss();
		tt.resetBoard();
		
		
		
		// TODO Auto-generated method stub

	}

}
