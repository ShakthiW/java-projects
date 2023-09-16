import java.util.Scanner;
public class Main {
    public static int factorial(int number){
        if (number == 0){
            return 1;
        } else {
            return number * factorial(number-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println("Factorial is " + result);
    }
}