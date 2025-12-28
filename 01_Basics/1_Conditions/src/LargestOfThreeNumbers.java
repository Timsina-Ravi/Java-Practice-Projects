import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter a third number: ");
        int num3 = scanner.nextInt();
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greater");
        }else if(num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater");
        }else {
            System.out.println(num3 + " is greater");
        }
        scanner.close();

    }
}