package Java1DArray2;

import java.util.Scanner;

public class Main2 {
    //   return rec(leap=3, game, 0, visited); //  record or cal the first game played
    //                          i is created to explain game; visited is to return boolean
    //int[] game = new int[5];
    // game[i=0] =0;
    // game[i=1] = 0;
    // game[i=2] = 0;
    // game[i=3] = 0;
    // game[i=4] = 0;
    // game.lenght = n = 5
    //  int[]  game ={0,0,0,0,0}
        public static boolean rec(int leap, int[]  game, int i, boolean[] visited)
        {
            //System.out.println(i);
            if(i>= game.length) //  if 6>=5
            {
                //System.out.println(i);
               // System.out.println(game.length);
                return true;
            }

            if(visited[i] == true || game[i]!=0) // game visited is true or  game[] size n = 5, leap = 3 (first query)
            {
                return false;
            }
            visited[i] = true;

            if(rec(leap, game, i+leap, visited)) //
            {
                return true;
            }

            if(rec(leap, game, i+1, visited))
            {
                return true;
            }

            if(i-1>=0)
            {
                if(rec(leap, game, i-1, visited))
                {
                    return true;
                }
            }

            return false;

        }
        // System.out.println( (canWin(leap, game)) ? "YES" : "NO" ); // game is game[] size n
        public static boolean canWin(int leap, int[] game) {
                         // Return true if you can win the game; otherwise, return false.
            boolean[] visited = new boolean[game.length];
            int i = 0;

            return rec(leap, game, i, visited); // record or cal the first game played
            // return rec(3, game, 0, visited); // record or cal the first game played
          //                     i is created to explain game; visited is to return boolean
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt(); // q = 4 (number of queries (i.e., function calls))
            while (q-- > 0) {  //  condition q=4-->0 is true, New or (First q | leap) is 3  // while loop gives us the ability to loop through the scannning
                int n = scan.nextInt();   //  size n = 5  = game[] or game.length
                int leap = scan.nextInt(); //   leap or jump the game = 3 (first query)

                int[] game = new int[n]; // Arrays of game played // where n is the size of the Array
                //int[] game = new int[5];
                // game[i=0] = 0;
                // game[i=1] = 0;
                // game[i=2] = 0;
                // game[i=3] = 0;
                // game[i=4] = 0;
                // game.lenght = n = 5

                for (int i = 0; i < n; i++) { //0<5 ; i=0,1,2,3,4 // (for cond) referring to game[i's]
                    game[i] = scan.nextInt(); // 0 0 0 0 0 inserting game five times
                }

                System.out.println( (canWin(leap, game)) ? "YES" : "NO" ); // game is game[] size n
            }
           // scan.close();
        }
    }

    /*
Sample Input
    STDIN           Function
-----           --------
4               q = 4 (number of queries)
5 3             game[] size n = 5, leap = 3 (first query)
0 0 0 0 0       game = [0, 0, 0, 0, 0]
6 5             game[] size n = 6, leap = 5 (second query)
0 0 0 1 1 1     . . .
6 3
0 0 1 1 1 0
3 1
0 1 0  */


