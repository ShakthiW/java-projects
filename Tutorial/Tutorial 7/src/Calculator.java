import java.util.Scanner;

public class Calculator {
    public static double addition(){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num1 = num.nextInt();
        System.out.print("Enter the 2nd number: ");
        double num2 = num.nextInt();

        return num1 + num2;
    }
    public static double subtraction(){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num1 = num.nextInt();
        System.out.print("Enter the 2nd number: ");
        double num2 = num.nextInt();

        return num1 - num2;
    }

    public static void main(String[] args) {
        System.out.println("**********");
        System.out.println("   MENU");
        System.out.println("**********");
        System.out.println("1.- Addition");
        System.out.println("2.- Subtraction");
        System.out.println("0.- Quit");

        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.print("Please select an option: ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    // method for addition
                    double total = addition();
                    System.out.println("Sum is : " + total);
                    break;

                case 2:
                    // Method for Subtraction
                    double remainder = subtraction();
                    System.out.println("Ans is : " + remainder);
                    break;

                case 0:
                    // Quit
                    quit = true;
                    break;

                default:
                    System.out.println("Not a valid option");
            }
        }
    }
}
