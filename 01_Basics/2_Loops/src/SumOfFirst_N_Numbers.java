import java.util.Scanner;

public class SumOfFirst_N_Numbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum =0;
        for(int i = 1; i<= number; i++){
            sum = i + number;
        }
        System.out.println(sum);
    }
}
