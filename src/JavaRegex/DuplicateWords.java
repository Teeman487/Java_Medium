package JavaRegex;

/*In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once,
              but retain the first occurrence of any case-insensitive repeated word.*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

        public static void main(String[] args) {

            String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+"; // DuplicateWords// Write a RegEx matching repeated words here
            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            //          Pattern compile( regexmatching repeated words,Insert the correct Pattern flag)

            Scanner in = new Scanner(System.in);
            int numSentences = Integer.parseInt(in.nextLine()); // numSentences =2 ;
            // we parse integer into (String scan), So we can make use of integer and string in while loop
            while (numSentences -- > 0) {    // 2-->0 then we loop twice
                String input = in.nextLine();  //

                // Match Pattern compiled with regex matching repeated words(in String)
                Matcher m = p.matcher(input); //  public final class Matcher implements MatchResult
                //           Pattern is matched(String)

                // Check for subsequences of input that match the compiled pattern
                while (m.find()) { // if Matcher finds subsequent input that match the compiled pattern
                    input = input.replaceAll(m.group(), m.group(1)); //Returns the input subsequence captured by the given group during the previous match operation.
                    //                      (Regex to replace, the replacement)
                }

                // Prints the modified sentence.
                System.out.println(input);
            }

            in.close();
        }
    }

    /*
    5
    Goodbye bye bye world world world
 Sam went went to to to his business
  Reya is is the the best player in eye eye game
 in inthe
   Hello hello Ab aB
     */


   /*
  Goodbye bye world
  Sam went to his business
  Reya is the best player in eye game
  in inthe
  Hello Ab
    */
