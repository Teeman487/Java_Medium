package JavaBigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();    // n==2
            String []s = new String[n+2]; // Arrays --   String []s = new String[4]
            // s[0] ="";
            // s[1] ="";
            // s[2] ="";
            // s[3] ="";

            for(int i = 0;i < n;i++){ // 0<2; i= 0,1 ; loop twice
                s[i] = sc.next();
                //s[0] ="";
                //s[1]="";
            }

            for(int i = 0;i<n;i++){  //  0<2; i= 0,1 ; loop twice
                BigDecimal max = new BigDecimal(s[i]);
                //  BigDecimal max = new BigDecimal(s[0]);
                //  BigDecimal max = new BigDecimal(s[1]);
                int idx = i; // idx = 0,1
                for(int j = i+1;j<n;j++) // j=1; 1<2 ; j= 1 ;j++ | j=2; 2<2; j++ condition wrong
                {
                    BigDecimal curr = new BigDecimal(s[j]); // BigDecimal max = new BigDecimal(s[1]);
                    if(curr.compareTo(max) == 1){
                        max=curr;
                        idx=j;
                    }
                }
                String temp = s[i];
                s[i] = s[idx];
                s[idx] = temp;
            }

            for(int i = 0;i<n;i++){
                System.out.println(s[i]);
            }

        }
}

/*
Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
 */

/*
90
56.6
50
02.34
0.12
.12
0
000.000
-100
 */
