/*Hetvi Patel
This program plays the rock,paper and scissors game. It asks the user to choose option and then generates random number to play from the 
computer's side. It then decided who won and displays it.
04/02/2020*/
import java.util.*;
public class RockPaperScissorDriver
{
    /*this main method calls the method play from the RockPaperScissors file and then also asks the user whether they would
    like to play again or not*/
    public static void main(String[] main)
    {
         Scanner kb = new Scanner(System.in);
         String go = null;
         while (true) 
         {
            RockPaperScissor.play();
         // Getting response from the user 'Y' or 'y' or 'N' or 'n'
            System.out.print("Do you want to play again? ");
            go = kb.next();
            if (go.equalsIgnoreCase("yes"))
                continue;
            else
            {
                System.out.println("GOOD BYE. COME BACK SOON");          
                break;
            }
         }
   
    }

}