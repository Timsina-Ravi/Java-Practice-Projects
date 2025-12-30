import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);

        if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u'){
            System.out.println(c + " is a Vowel");
        }else {
            System.out.println(c + " is a consonant");
        }

    }
}
