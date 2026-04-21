import java.util.Scanner;
public class weightconversion {
    public static void main(String[] args) {
      //weight conversion program//
        Scanner sc = new Scanner(System.in);
        double weight;
        double newweight;
        int choice;

        System.out.println("weight conversion program");
        System.out.println("1:convert weight from lbs to kg");
        System.out.println("2:convert weight from kg to lbs");  
      System.out.println("choose an option");
      choice= sc.nextInt();
    
      if(choice==1){
        System.out.println("enter weight in lbs");
        weight= sc.nextDouble();
        newweight= weight*0.453592;
        System.out.println("weight in kg is "+ newweight);
      }

        else if ( choice==2){
        System.out.println("enter weight in kg");
        weight = sc.nextDouble();
        newweight= weight*2.20462;
        System.out.println("weight in lbs is" +newweight);
        }

        else{
          System.out.println("invalid choice");

        }
      
    }
}
