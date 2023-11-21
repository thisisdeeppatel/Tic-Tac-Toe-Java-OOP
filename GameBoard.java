public class GameBoard
{
    char[][] board;

    public GameBoard()
    {
        board = new char[3][3];
        initBoard();
    }

    void initBoard()
    {
        for(int i=0 ; i <board.length ; i++)
        {
            for(int j=0 ; j<board[i].length ; j++)
            {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard()
    {
        System.out.println("-------------");
        for(int i=0 ; i <board.length ; i++)
        {
            System.out.print("| "); // board border
            for(int j=0 ; j<board[i].length ; j++)
            {
                System.out.print(board[i][j] + " | "); 
            }
            System.out.println("");
            System.out.println("-------------");
        }
        //System.out.println("-------------");
    }

   void addMarkRowCol(int row , int col , char mark)
    {
            board[row][col] = mark;
            System.out.println("Mark Added");
    }

    boolean checkWin()
    {
        
        for(int i=0 ; i<board.length ; i++) 
        {
            // check vertically
            if(board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
            {
                //System.out.println("debug vertical");
                return true;
            }

            // check Horizintally
            else if(board[i][0] != ' ' && (board[i][0] == board[i][1] && board[i][1] == board[i][2]))
            {
                //System.out.println("debug horizintal "+i);
                return true;
            }

            // diagonal boxes check
            else if(board[1][1] != ' ' && (board[0][0] == board[1][1] && board[1][1] == board[2][2]) )
            {
                //System.out.println("debug diagonal ");
                return true;
            }
            else if(board[1][1] != ' ' && (board[0][2] == board[1][1] && board[1][1] == board[2][0]))
            {	
            	return true;
            }
        }

        return false;
    }

    void addMark(int num , char mark)
    {
        
        int row=0,col=0;
        if (num > 9 || num < 1)
        {
            System.out.println("Invalid num");
        }
        else{

           row = (num-1) /3;
           col = (num-1)%3;
        }
       
        addMarkRowCol(row , col , mark);
        System.out.println(row + " "+ col);
    }

}
