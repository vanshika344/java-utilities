import java.util.Random;
import java.util.Scanner;

public class slotmachine {
    public static void main(String[] args) {
        //java slot machine
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int bet;
        int payout;
        String [] row;
        System.out.println("**********");
        System.out.println("welcome to the slot");
        System.out.println("symbols: @, $, %, #, &");
        System.out.println("**********");

        while(balance > 0) {
            System.out.println("current balance: $ " + balance);
            System.out.println("enter your bet amount:");
            bet = scanner.nextInt();
            
            if(bet > balance) {
                System.out.println("insufficient funds");
                continue;
            }
            else if (bet <= 0) {
                System.out.println("balance must be greater than 0");
                continue;
            }
            else {
                balance -= bet;
            }

            System.out.println("spinning ....");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0) {
                System.out.println("you won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("you lost $" + bet);
            }
        }
        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"@", "$", "%", "#", "&"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("**********");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**********");
    }

    static int getPayout(String[] row, int bet) {
        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]) {
                case "@" -> bet * 10;
                case "$" -> bet * 5;
                case "%" -> bet * 3;
                case "#" -> bet * 2;
                case "&" -> bet * 1;
                default -> 0;
            };
        }
        return 0;
    }
}