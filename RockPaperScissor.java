import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor
{
    //this method displays the description thats is displayed before the program starts
    public static void description()
    {
        System.out.println("Using this app you can play Rock-Paper-Scissors game against the computer. When played between ");
        System.out.println("two people, each person picks one of the three options at the same time, and the winner ");
        System.out.println("Is determined. The program should randomly choose one of the three options, then prompt for the ");
        System.out.println("user’s selection.  At that point, the program reveals both choices and print a ");
        System.out.println("Statement indicating if the user won, the computer won, or if it was a tie. Continue playing until the ");
        System.out.println("user choose to stop. Then print the total number of the games played, total wins, total losses, and ");
        System.out.println("total ties."); 
        System.out.println();
        System.out.println("Ready, Set, Go"); 
    }
    //the method createrandom() generates random numbers for the computer to play
    public static String createrandom()
    {
        Random rand = new Random();
        int select = rand.nextInt((3-1)+1);
        String choice1 = "";
        if(select==1)
           choice1="rock";
        else if(select==2)
           choice1="paper";
        else 
           choice1="scissors";
        return choice1;
    }
    //this method asks the user to choose options from rock, paper and scissors and then competes with the computer
    public static String userchoice()
    {
        Scanner kb = new Scanner(System.in);
        String choice= "";
        while(true)
        {
             while(true)
             {
                 System.out.println("your choice");
                 System.out.println("       Rock");
                 System.out.println("       Paper");
                 System.out.println("       Scissors");
                 System.out.println("       stop");
                 System.out.print("Enter your choice: ");
                 choice = kb.nextLine();
                 if(choice.equalsIgnoreCase("rock")||choice.equalsIgnoreCase("paper")||choice.equalsIgnoreCase("scissors")||choice.equalsIgnoreCase("stop"))
                 {
                     break;
                 }
                 else
                 {
                     continue;
                 } 
             }
             break;
         }
         return choice;
    } 
    /*this method does all the playing, it compares the options of the user and computer and then outputs whoever wins. It also gives
    the total result. It shows the wins, loses and ties and then finally decided whther the computer won or the user*/
    public static void play()
    {
        int compcnt=0, playercnt=0, tie=0;
        int count=0;
        String win = null;
        String x = null;
        description();
        while(true)
        {
           x = userchoice();
           String y = createrandom();
           System.out.println();
           System.out.println("Computer selected: " + y);
           System.out.println("You selected: " + x.toUpperCase());  
           System.out.println();
           if(x.equalsIgnoreCase("rock")&&y.equalsIgnoreCase("scissors"))
      	  {
      	       win = "Hurray! You won";
                //System.out.println();
      	       playercnt++;
                count++;
      	  }
           else if(x.equalsIgnoreCase("rock")&&y.equalsIgnoreCase("paper"))
   	     {
   	          win = "Oh No,you lost";
                //System.out.println();
   	          compcnt++;
                count++;
   	     }
      	  else if(x.equalsIgnoreCase("paper")&&y.equalsIgnoreCase("rock"))
      	  {
      	       win = "Hurray! You won";
                //System.out.println();
      	       playercnt++;
                count++;
      	  }
      	  else if(x.equalsIgnoreCase("paper")&&y.equalsIgnoreCase("scissors"))
      	  {
      	       win = "Oh No,you lost";  
                //System.out.println(); 
          	    compcnt++;
                count++;
      	  }
      	  else if(x.equalsIgnoreCase("scissors")&&y.equalsIgnoreCase("rock"))
      	  {
                win = "Oh No,you lost";
                //System.out.println();
            	 compcnt++;
                count++;
      	  }
      	  else if(x.equalsIgnoreCase("scissors")&&y.equalsIgnoreCase("paper"))
      	  {
      	     	   
                win = "Hurray! You won";
                //System.out.println();
                playercnt++;
                count++;
      	  } 
           else if(x.equalsIgnoreCase("stop"))
           {
                break;
           }
           else
           {
                win = "There is a tie";
                tie++;
                count++;
           }
           System.out.println(win);
           System.out.println();
        }
        System.out.println("------------------------------------");
        System.out.println("Here is the result of the play: ");
        System.out.println("Times played: " + count); 
        System.out.println("Wins: " + playercnt);
        System.out.println("Losses: " + compcnt);
        System.out.println("Ties: " + tie); 
        if(playercnt>compcnt)
        {
             System.out.println("Congratulations! You won.");
        }
        else if(compcnt>playercnt)
        {
             System.out.println("Sorry computer won this time. Try again");
        } 
        else 
        {
             System.out.println("Game Tie");
        } 
    } 
}