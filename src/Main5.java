import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // n==2
        String []s = new String[n+2];

        for(int i = 0;i < n;i++){ // 0<2; i= 0,1 ; loop twice
            s[i] = sc.next();
            System.out.println(i);
        }

      //BigDecimal max = new BigDecimal(s[i]);

    }
}
