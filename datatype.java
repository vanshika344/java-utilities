import java.util.Scanner;
public class datatype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Primitive Data Types
        int integer = 10;
        double decimal = 10.5;
        char character = 'A';
        boolean booleanValue = true;

        System.out.println("Integer: " + integer);
        System.out.println("Double: " + decimal);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + booleanValue);

        sc.close();
    }
}