import java.util.*;

public class moneyCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount the customer need to pay(Taka)");
        int totalAmount = scanner.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int gaveAmount = scanner.nextInt();

        if (gaveAmount > totalAmount) {
            int change = gaveAmount - totalAmount;
            System.out.println("The returned amount is " + change + " taka.");
            int hundred = change / 100;
            change = change % 100;
            int fifty = change / 50;
            change = change % 50;
            int twenty = change / 20;
            change = change % 20;
            int ten = change / 10;
            change = change % 10;
            int five = change / 5;
            change = change % 5;
            int two = change / 2;
            change = change % 2;
            int one = change;

            System.out.println(" 100 Taka note: " + hundred);
            System.out.println(" 50 Taka note: " + fifty);
            System.out.println(" 20 Taka note: " + twenty);
            System.out.println(" 10 Taka note: " + ten);
            System.out.println(" 5 Taka note: " + five);
            System.out.println(" 2 Taka note: " + two);
            System.out.println(" 1 Taka note: " + one);

        } else if (gaveAmount == totalAmount) {
            System.out.println("The returned amount is " + (totalAmount - gaveAmount) + " taka.");
        } else {
            System.out.println("Please pay " + (totalAmount - gaveAmount) + " taka more.");
        }

        scanner.close();
    }
}
