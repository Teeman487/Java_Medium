package JavaRegex;

import java.util.Scanner;

public class Main {


        public static void main(String []args)
        {
            Scanner in = new Scanner(System.in);

            /* String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));*/ // this wil scan Ip address once

            while(in.hasNext()) // Reading element or scanning Ip address more than one time
            {
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }

    //YOU SHOULD ONLY SUBMIT THE FOLLOWING BLOCK
     class MyRegex {  // (MyRegex class MUST NOT be public)
        String pattern =
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        //  strings containing any combination of ASCII characters.
        //  We had to write a regular expression to find the valid IPs.

    }


       // IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
        // Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
    /*     000.12.12.034
            121.234.12.12
            23.45.12.56
            00.12.123.123123.123
            122.23
            Hello.IP */

        /*true
         true
         true
         false
         false
         false*/