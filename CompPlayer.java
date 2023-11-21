
import java.util.Random;
public class CompPlayer extends IPlayer
{

    public CompPlayer(String name , char mark, GameBoard gameBoard)
    {
        this.name = name;
        this.mark = mark;
        this.gameBoard = gameBoard;
    }

    public void makeMove()
    {
        int num=0;
        do
        {
            int min =1;
            int max = 9;
            Random r = new Random();
            num = r.nextInt((max-min) +1)+min;
            
        } while(validateMove(num) != true);

        gameBoard.addMark(num, mark);
    }

    boolean validateMove(int number)
    {
        if(number <=9 && number>=0 )
        {
            int row = (number-1) /3;
            int col = (number-1) % 3;
            if(gameBoard.board[row][col] == ' ')
            {
                return true;
            }
        }
        return false;
    }

}
