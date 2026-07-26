import java.util.Random;
import java.util.Scanner;
public class rockpaperscissors {
    public static void main(String[] args) {
        //rock paper scissors game
//declare variables
      Scanner scanner = new Scanner  (System.in);
        Random random = new Random();
        String[] choices = {"rock", "papers" , "scissors"};
        String userchoice;
        String computerchoice;
        String playagain = "yes";

        do{
        System.out.println("enter your choice (rock , papers, scissors)");
        userchoice = scanner.nextLine().toLowerCase();
        

        if(!userchoice.equals("rock") && !userchoice.equals("paper") && !userchoice.equals("scissors")){
            System.out.println("invalid choice");
            continue;
        }

            computerchoice = choices[random.nextInt(3)];
            System.out.println("computer choice is " + computerchoice);
            
            if(userchoice.equals (computerchoice)){
                System.out.println("its a tie");

            }
            else if (userchoice.equals("paper") && computerchoice.equals("rock")){
            System.out.println("you win");
        }
        else if (userchoice.equals("rock") && computerchoice.equals("scissors")){
            System.out.println("you win");
        }
        else if (userchoice.equals("scissors") && computerchoice.equals("paper")){
            System.out.println("you win");
        }
        else{
            System.out.println("computer wins");
        }
        System.out.println("do you want to play again? (yes/no)");

        playagain = scanner.nextLine().toLowerCase();

    }while(playagain.equals("yes"));

    System.out.println("thanks for playing");


        scanner.close();
clear

}
}
