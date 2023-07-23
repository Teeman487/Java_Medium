package WhileStatementFormat;

public class Main {
    public static void main(String[] args) {

        int no = 0; //                          //no=6
        while (no  <15){ //0<15 is true;        // 6<15 is true;
            no++;       // no= 1               // no=7
            if(no<=5){    // if  1 <=5 is true      // 7<=5 is false
                System.out.println("Skipping Number" + no); // execute code block (no=1)
                continue;  // continue with a loop(bypass all other code in the block(body) until 5=5
            } // since 6 is not <=5
            System.out.println("Number" + no); // then execute code block      // (no=7)
            if(no >=10) {// if this condition is true, break  //  6 >=10 if false, then return 6 to the Top
                System.out.println("Breaking" + no);
                break;
            }



        }
    }
}
