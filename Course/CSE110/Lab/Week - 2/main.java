
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a number: ");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Number is negative");
        }
        if (number == 0) {
            System.out.println("Number is zero");
        }
        if (number > 0 && number % 2 == 0) {
            System.out.println("Number is positive and even");
        }
        if (number > 0 && number % 2 != 0) {
            System.out.println("Number is positive and odd");
        }

        scanner.close();
    }
}