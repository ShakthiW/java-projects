import java.util.Scanner;

public class SumOfTwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double num_1 = input.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double num_2 = input.nextDouble();
        
        double total = num_1 + num_2;
        System.out.println("The sum of " + num_1 + " and " + num_2 + " is " + total);
    }
}