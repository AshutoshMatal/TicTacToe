
public class TicTacToe {

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
			//System.out.println("|");
			System.out.println("");
			
		}
		

	}
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe");
		TicTacToe tt=new TicTacToe();
		tt.resetBoard();
		
		// TODO Auto-generated method stub

	}

}
