import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Menu: ");
        System.out.println(" 1. Check a number is odd or even: ");
        System.out.println(" 2. check a number is positive, negative or zero: ");
        System.out.println(" 3. find largest of two numbers: ");
        System.out.println(" 4. find largest of three numbers: ");
        System.out.println(" 5. check leap year: ");
        System.out.println(" 6. check valid triangle: ");
        System.out.println("===========================================");
        System.out.println("Enter your choice: ");
        System.out.println("===========================================");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is a even number");
            } else {
                System.out.println(num + " is a odd number");
            }
        } else if (choice == 2) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println(num + " is positive number");
            } else if (num < 0) {
                System.out.println(num + " is negative number");
            } else {
                System.out.println(num + "is Zero");
            }

        } else if (choice == 3) {
            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                System.out.println(num1 + " is greater");
            } else {
                System.out.println(num2 + " is greater");
            }
        } else if (choice == 4) {
            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.println("Enter third number: ");
            int num3 = scanner.nextInt();

            if (num1 >= num2 && num1 >= num3) {
                System.out.println(num1 + " is greater");
            } else if (num2 >= num1 && num2 >= num3) {
                System.out.println(num2 + " is greater");
            } else {
                System.out.println(num3 + " is greater");
            }
        }else if (choice == 5){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if ((number % 4 == 0) && (number % 100 != 0 || number % 400 == 0)) {
                System.out.println(number + " is a leap year");
            }else {
                System.out.println(number + " is not a leap year");
            }
        }else if(choice == 6){
            System.out.println("Enter the first side of a triangle");
            int a = scanner.nextInt();
            System.out.println("Enter the second side of a triangle");
            int b = scanner.nextInt();
            System.out.println("Enter the third side of a triangle");
            int c = scanner.nextInt();

            if(a+b > c && b + c > a && a + c > b){
                System.out.println("It is a valid triangle");
            }else {
                System.out.println("It is not a valid triangle");
            }
        }else {
            System.out.println("Invalid choice!, Enter a valid choice");
        }
        scanner.close();
    }
}
