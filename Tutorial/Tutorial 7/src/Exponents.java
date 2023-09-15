import java.util.Scanner;

public class Exponents {
    public static int exponent(int number, int exponent){
        if (exponent == 0){
            return 1;
        } else {
            return number * exponent(number, exponent-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Enter the exponent: ");
        int expo = input.nextInt();
        int result = exponent(number, expo);
        System.out.println("Ans is : " + result);
    }
}
