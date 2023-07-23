import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n =2;
        String []s = new String[n+2]; // 4
        for(int i = 0;i < n;i++){ // 0<2; i= 0,1
            s[i] = sc.next();
        }



        System.out.println(s);



    }
}
