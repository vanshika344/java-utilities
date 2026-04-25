import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        // Arithmetic Operators
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Relational Operators
        System.out.println("Is num1 equal to num2? " + (num1 == num2));
        System.out.println("Is num1 not equal to num2? " + (num1 != num2));
        System.out.println("Is num1 greater than num2? " + (num1 > num2));
        System.out.println("Is num1 less than num2? " + (num1 < num2));
        System.out.println("Is num1 greater than or equal to num2? " + (num1 >= num2));
        System.out.println("Is num1 less than or equal to num2? " + (num1 <= num2));

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Condition 1 AND Condition 2: " + (condition1 && condition2));
        System.out.println("Condition 1 OR Condition 2: " + (condition1 || condition2));
        System.out.println("NOT Condition 1: " + (!condition1));

        sc.close();
    }
    
}
