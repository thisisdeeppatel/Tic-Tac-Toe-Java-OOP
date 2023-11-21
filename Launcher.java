public class Launcher
{
    public static void main(String[] args) {
        System.out.println("---INIT OK---");

        GameBoard gb = new GameBoard(); // to init board.


        HumPlayer hum1 = new HumPlayer("Human", 'X' , gb);
        CompPlayer c1 = new CompPlayer("Computer", 'O' ,gb);

        IPlayer currentPlayer;
        currentPlayer = hum1;

        int numMoves = 0;
       while(true)
       {
            if(numMoves == 9)
            {
                System.out.println("GAME DRAW. None is Won!");
                break;
            }

            System.out.println(currentPlayer.name + "'s Turn");

            currentPlayer.makeMove();
            gb.displayBoard();

            if(gb.checkWin())
            {
                System.out.println(currentPlayer.name + " has Won");
                break;
            }
            else
            {
                if(currentPlayer == hum1)
                {
                    currentPlayer =c1;
                }
                else
                {
                    currentPlayer= hum1;
                }
            }
            numMoves++;
       }
    }
}

