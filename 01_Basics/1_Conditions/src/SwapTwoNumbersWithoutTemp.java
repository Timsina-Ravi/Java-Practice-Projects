public class SwapTwoNumbersWithoutTemp {
    public static void main(String[] args) {

        int a = 97;
        int b = 83;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);

    }
}
