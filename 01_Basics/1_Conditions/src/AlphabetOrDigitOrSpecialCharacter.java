import java.util.Scanner;

public class AlphabetOrDigitOrSpecialCharacter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = scanner.next().charAt(0);

        if (c == 'A' || c == 'a' || c == 'B' || c == 'b' || c == 'C' || c == 'c'
                || c == 'D' || c == 'd' || c == 'E' || c == 'e' || c == 'F' ||
                c == 'f' || c == 'G' || c == 'g' || c == 'H' || c == 'h' ||
                c == 'I' || c == 'i' || c == 'J'|| c == 'j'|| c == 'K' ||
                c == 'k' || c == 'L' || c == 'l' || c == 'M' || c == 'm'
                || c == 'N' || c == 'n' || c == 'O' || c == 'o' || c == 'P'
                || c == 'p' || c == 'Q' || c == 'q' || c == 'R' || c == 'r'
                || c == 'S' || c == 's' || c == 'T' || c == 't' || c == 'U'
                || c == 'u' || c == 'V' || c == 'v' || c == 'W' || c == 'w'
                || c == 'X' || c == 'x' || c == 'Y' || c == 'y' || c == 'Z'
                || c == 'z'){
            System.out.println( c + " is a alphabet");
        }else if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' ||
                    c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){
            System.out.println( c + " is a digit");
        }else {
            System.out.println( c + " is a special character");
        }


    }
}
