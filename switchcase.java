import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
       switch (age){
        /*case 18:
            System.out.println("u are going to become adult");
            break;
            case 23:
                System.out.println("u are going to join job");
                break;
            default:
                System.out.println("u are not in the specified age groups");*/

        case 18 -> System.out.println("u are going to become adult");
        case 23 -> System.out.println("u are g18oing to join job");
        default -> System.out.println("u are not in the specified age groups");
        }
    }
}
