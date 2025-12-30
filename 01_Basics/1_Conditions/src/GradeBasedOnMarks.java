import java.util.Scanner;

public class GradeBasedOnMarks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = scanner.nextDouble();

        if(marks < 0 || marks> 100){
            System.out.println("Invalid input, Enter your marks: ");
        }else if (marks >= 80 && marks <=100){
            System.out.println("A");
        }else if(marks >=60 && marks < 80) {
            System.out.println("B");
        }else if(marks >= 40 && marks < 60) {
            System.out.println("C");
        }else {
            System.out.println("F");
        }

        scanner.close();
        }
    }

