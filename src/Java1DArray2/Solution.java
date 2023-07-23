package Java1DArray2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(); // q = 4 (number of queries (i.e., function calls))
        while (q-- > 0) {  //  condition q=4-->0 is true, New or (First q | leap) is 3  // while loop gives us the ability to loop through the scannning
            int n = scan.nextInt();   //  size n = 5  = game[] or game.length
            int leap = scan.nextInt(); //   leap or jump the game = 3 (first query)

            int[] game = new int[n]; // Arrays of game played // where n is the size of the Array

            for (int i = 0; i < n; i++) { //0<5 ; i=0,1,2,3,4 // (for cond) referring to game[i's]
                game[i] = scan.nextInt(); // 0 0 0 0 0 inserting game five times
                System.out.println(i);
            }

           // System.out.println(i);
            //System.out.println( (canWin(leap, game)) ? "YES" : "NO" ); // game is game[] size n


        }
    }
}
