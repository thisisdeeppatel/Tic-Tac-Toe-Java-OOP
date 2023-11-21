import java.util.Scanner;
public class HumPlayer extends IPlayer
{
    

    public HumPlayer(String name , char mark, GameBoard gameBoard)
    {
        this.name = name;
        this.mark = mark;
        this.gameBoard = gameBoard;
    }

    public void makeMove()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        do
        {
            System.out.print("Enter Position(1-9): ");
            num = sc.nextInt();

        } while(validateMove(num) != true);
        
        gameBoard.addMark(num, mark);
    }

    boolean validateMove(int number)
    {
        if(number <=9 && number>=0 )
        {
            int row = (number-1) /3;
            int col = (number-1)%3;
            if(gameBoard.board[row][col] == ' ')
            {
                return true;
            }
        }
        return false;
    }
    
}
