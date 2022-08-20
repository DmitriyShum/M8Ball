/*
* Author: Dmitriy S
* Date: 8/19/22
*
* M8Ball is for public use and shall not be sold by any individual/company, the purpose is only to demonstrate. Just simply enjoy and ask away.
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.InputMismatchException;

public class M8Ball {
   public static boolean hasQuestion;

   public static void main(String[] args){

   Scanner keyboard = new Scanner(System.in);
   Random random = new Random();
   String[] ans = new String[] 
   {"Magic 8 Ball: It is certain", 
   "Magic 8 Ball: It is decidedly so.",
   "Magic 8 Ball: Without a doubt.",
   "Magic 8 Ball: Yes, definitely", 
   "Magic 8 Ball: The outlook is good.",
   "Magic 8 Ball: You may rely on it.",
   "Magic 8 Ball: Ask again later.",
   "Magic 8 Ball: Better not tell you now.", 
   "Magic 8 Ball: Cannot predict now.", 
   "Magic 8 Ball: Concentrate and try again.",
   "Magic 8 Ball: Reply hazy, try again.",
   "Magic 8 Ball: Outlook not so good.", 
   "Magic 8 Ball: Very doubtful.", 
   "Magic 8 Ball: My reply is no.",
   "Magic 8 Ball: My sources say no."};

   hasQuestion = false;
   String question = "";
   int randAns = random.nextInt(ans.length);

      //input
      try{
      System.out.println("Do you have a question? true/false");
      hasQuestion = keyboard.nextBoolean();
      }catch(InputMismatchException i){
         System.out.println("Magic 8 Ball could not understand and has failed.");
      }
         if(hasQuestion == true){
      System.out.println("Enter your question, and I shall answer with truth : ");
      question = keyboard.nextLine();
      keyboard.nextLine();
         }else{
            System.out.println("Exiting...");
            System.exit(0);
         }//end else

        //output
         System.out.println(ans[randAns]);
         System.out.println("");
   }//end main method
}//end class
