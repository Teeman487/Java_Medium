package Java1DArray2;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // q=1
        while (q-- > 0) {  // if 2-- >0 condition is true; loop twice
            int n = scanner.nextInt();  // n=2
            int leap = scanner.nextInt(); // leap=3
            int[] game = new int[n];    //
            // int[] game = new int[2]
            //game[0] = ;
            //game[1] = ;

            for (int i = 0; i < n; i++) { // 0<2; i= 0,1  loop twice
                game[i] = scanner.nextInt();
                // game[0] = scanner.nextInt(); // 1
                // game[1] = scanner.nextInt();  // 2

            }
            System.out.println(canWin(leap, game) ? "YES" : "NO"); // is boolean // leap =3, game = int[] game
            //            canWin method must be created below to sustain it
            //System.out.println(canWin(3, game)
           // System.out.println(canWin(3, game[0] = scanner.nextInt());
            // System.out.println(canWin(3, game[1] = scanner.nextInt());


        }
        scanner.close();
    }


    public static boolean canWin(int leap, int[] game) { // built for System.out.println(canWin(leap, game) ? "YES" : "NO");
        //int leap = scanner.nextInt(); // leap=3
        //int[] game = new int[n];
        return canWin(leap, game, 0); // we return Array game as game, 0    // leap =3,

    }
    private static boolean canWin(int leap, int[] game, int i) { // built for   return canWin(leap, game, 0);
         //
        if (i >= game.length) {  //  game.length=2
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }
        game[i] = 1;

        return canWin(leap, game, i + leap) ||  //  built  for canWin(int leap, int[] game, int i)
                canWin(leap, game, i + 1) ||
                canWin(leap, game, i - 1);
    }



}

