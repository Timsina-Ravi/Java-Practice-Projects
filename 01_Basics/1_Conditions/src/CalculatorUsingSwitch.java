import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("========== Calculator ========== : ");
        System.out.println("1. Add numbers: ");
        System.out.println("2. Subtract numbers: ");
        System.out.println("3. Multiply numbers: ");
        System.out.println("4. Divide numbers: ");
        System.out.println("=================================");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result: " + (a + b));
                break;

            case 2:
                System.out.println("Result: " + (a - b));
                break;

            case 3:
                System.out.println("Result: " + (a * b));
                break;

            case 4:
                System.out.println("Result: " + (a / b));
                break;

            default:
                System.out.println("Invalid input, Enter a valid number ");
        }
        scanner.close();
    }
}
