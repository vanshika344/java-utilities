
import java.util.Scanner;
public class practiceques {
    public static void main(String[] args) {
        //1//
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter marks of three subjects");
       int maths,science,english;
         System.out.print("maths: ");
       maths = scanner.nextInt();
       System.out.print("science: ");
       science = scanner.nextInt();
       System.out.print("english: ");
       english = scanner.nextInt();

       float avg =( maths+science+english)/3.0f;

       if(avg>=40 && maths>=33&& science>=33&&english>=33)
         {
          System.out.println("congratulations! you have passed");
         }
         else{
          System.out.println("sorry! you have failed");
         }
    
       
    }
}
