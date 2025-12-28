import java.util.Scanner;

public class CheckValidTriangle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
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
        scanner.close();

    }
}
