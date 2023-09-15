import java.util.Scanner;

public class TempCheck{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp = input.nextDouble();
        
        if (temp > 30) {
            System.out.println("Hot");
        
        } else {
            System.out.println("Cold");
        }
    }
}