package TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){



        String pattern = "<([^>]+)>([^<>]+)</\\1>"; // Content Extractor
        Pattern r = Pattern.compile(pattern);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        // we parse integer into (String scan), So we can make use of integer and string in while loop
        while(testCases > 0){
            String line = in.nextLine();

            Matcher m = r.matcher(line);
            boolean findMatch = true;
            //Check for subsequences of line that match the compiled pattern
            while(m.find( )){ // if Matcher finds subsequent line that match the compiled pattern
                // Statement----  <h1>Nayeem loves counseling</h1>
                // System.out.println(m.group(0)); // <h1>Nayeem loves counseling</h1>
                //System.out.println(m.group(1)); // h1
                System.out.println(m.group(2)); // Nayeem loves counseling
                // System.out.println(m.group(3)); // Exception

                findMatch = false;
            }
            if(findMatch) {// if findMatch is true // <h1>Nayeem loves counseling<h1>
                System.out.println("None"); // print---None
            }
            testCases--; // make use loop twice
        }
    }
}

/* Sample Input
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
 */

/* Sample output
Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush

 */