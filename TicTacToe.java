
public class TicTacToe {
//VARIABLES
	String player;
	String Letter;
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
		}
		else
		{
			player="O";
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		TicTacToe tt=new TicTacToe();
		tt.resetBoard();
		
		// TODO Auto-generated method stub

	}

}
