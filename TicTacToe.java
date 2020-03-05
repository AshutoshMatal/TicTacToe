import java.util.*;
import java.util.Arrays;

public class TicTacToe {
// VARIABLES
    public static char player = 'X';
    public static char computer = 'X';
    //INITIALISING
    public static char board[][] = new char[3][3];
    public static int count = 0;
// RESETTING A GAME BOARD
    public static void Board()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = '-';
                System.out.print("   " + board[i][j] + "\t|");
            }
            System.out.println();
        }
    }
// DISPLAYING THE GAME BOARD
    public static void display_board()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {

                System.out.print("   " + board[i][j] + "\t|");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");

    }
//  TIE CONDITION
    public static void tie_condition()
    {
        if (count == 9)
        {
            System.out.println("Game is tie");
        }
    }
    // WIN CONDITION
public static void computer_win_condition()
{
System.out.println("computer turn:");
int x = (int) (Math.random() * (3 - 0));
    int y = (int) (Math.random() * (3 - 0));
if (board[x][y] == '-')
{
//FOR LOOP IS USE TO TRAVERSE THE ROW THEN COLUMN AND THE TWO DAIGONALS
for (int i = 0; i < 3; i++)
{
        int j = 0;
        char Horizontal[] = { board[i][j], board[i][j + 1], board[i][j + 2] }; //ROW
        char vertical[] = { board[j][i], board[j + 1][i], board[j + 2][i] }; //COLUMN
        char firstDiagonal[] = { board[0][0], board[1][1], board[2][2] }; //FIRST DAIGONAL
        char secondDiagnol[] = { board[0][2], board[1][1], board[2][0] }; //SECOND DAIGONAL
       
        char H1[] = { computer, computer, '-' };
        char H2[] = { computer, '-', computer };
        char H3[] = { '-', computer, computer };
    //FOR ALL THE ROW AND COLUMN AND THE DAIGONALS ALL THE FUNCTIONS ARE USED
            if (Arrays.equals(Horizontal, H1))
            {
                board[i][j + 2] = computer;
                display_board(); //DISPLAY FUNCTION IS CALL
                count++;
                tie_condition(); //TIE CONDITION FUNCTION IS CALL
                check_winner(); //CHECK WINNER FUNCTION IS CALL
                playerTurn(); //PLAYER TURN FUNCTION IS CALL
            }
            else if (Arrays.equals(Horizontal, H2))
            {
           
                board[i][j + 1] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
            else if (Arrays.equals(Horizontal, H3))
            {
                board[i][j] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
            else if (Arrays.equals(vertical, H1))
            {
                board[j + 2][i] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            } else if (Arrays.equals(vertical, H2))
            {
                board[j + 1][i] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            } else if (Arrays.equals(vertical, H3))
            {
                board[j][i] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
            else if (Arrays.equals(firstDiagonal, H1))
            {
                board[2][2] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
            else if (Arrays.equals(firstDiagonal, H2))
            {
                board[1][1] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
            else if (Arrays.equals(firstDiagonal, H3))
            {
                board[0][0] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
            else if (Arrays.equals(secondDiagnol, H1))
            {
                board[2][0] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            } else if (Arrays.equals(secondDiagnol, H2))
            {
                board[1][1] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
            else if (Arrays.equals(secondDiagnol, H3))
            {
                board[0][2] = computer;
                display_board();
                count++;
                tie_condition();
                check_winner();
                playerTurn();
            }
}
            board[x][y] = computer;
            display_board();
            count++;
           tie_condition();
            check_winner();
            playerTurn();

        }
else
{
        computerTurn();
    }
}
//CHECK WINNER FUNCTION
public static void check_winner() 
{
    for (int i = 0; i < 3; i++) 
    {
        int j = 0;
        // for (int j = 0; j < 3; j++) {
        char Horizontal[] = { board[i][j], board[i][j + 1], board[i][j + 2] };
        char vertical[] = { board[j][i], board[j + 1][i], board[j + 2][i] };
        char firstDiagonal[] = { board[0][0], board[1][1], board[2][2] };
        char secondDiagnol[] = { board[0][2], board[1][1], board[2][0] };
        char player_win[] = { player, player, player };
        char computer_win[] = { computer, computer, computer };
        if (Arrays.equals(Horizontal, player_win)) {
            System.out.println("Player wins");
            System.exit(0);
        } else if (Arrays.equals(Horizontal, computer_win))
        {
            System.out.println("computer wins");
            System.exit(0);
        }

        if (Arrays.equals(vertical, player_win))
        {
            System.out.println("Player wins");
            System.exit(0);
        }
        else if (Arrays.equals(vertical, computer_win))
        {
            System.out.println("computer wins");
            System.exit(0);
        }

        if (Arrays.equals(firstDiagonal, player_win))
        {
            System.out.println("Player wins");
            System.exit(0);
        } else if (Arrays.equals(firstDiagonal, computer_win))
        {
            System.out.println("computer wins");
            System.exit(0);
        }

        if (Arrays.equals(secondDiagnol, player_win))
        {
            System.out.println("Player wins");
            System.exit(0);
        } else if (Arrays.equals(secondDiagnol, computer_win))
        {
            System.out.println("computer wins");
            System.exit(0);
        }
    }
}
//PLAYER TURN
public static void playerTurn()
{
if (count == 9)
 {
        // System.out.println(count);
        System.exit(0);
 }

    System.out.println("Enter value of x and y");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    // char space = '-';
    if (board[x][y] == '-')
    {
        System.out.println("Player turn:");
        board[x][y] = player;
        display_board();
        count++;
        tie_condition();
        check_winner();
        computerTurn();
    }
    else
    {
        System.out.println("Place already occupied:"); //IF THE VALUE IS FILLED THEN IT WILL SHOW THIS MSG
        playerTurn(); // PLAYER TURN METHOD IS CALL
    }

}
public static void computerTurn()
{
    if (count == 9) // COUNT TILL 9 FOR THW COMPUTER
    {
        // System.out.println(count);
        System.exit(0);

    }
    else
    {
    computer_win_condition();
   // COMPUTER WIN CONDITION IS CALL
    }
}
}