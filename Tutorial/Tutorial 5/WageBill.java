import java.util.*;

public class WageBill{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Manual Workers: ");
        int manual = input.nextInt();
        System.out.print("Enter the number of Skilled Workers: ");
        int skilled = input.nextInt();
        System.out.print("Enter the number of Management Workers: ");
        int management = input.nextInt();
        int totalWage = (manual*500) + (skilled*700) + (management*800);
        double tax = totalWage * 0.2;
        
        System.out.println("");
        System.out.print("Your total wage for the week is: $");
        System.out.println(totalWage);
        System.out.print("Total tax per week is: $");
        System.out.println(tax);
    }
}