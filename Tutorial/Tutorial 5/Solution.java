import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter the temperature in Celius: ");
        double tempC = temp.nextDouble();
        
        double tempF = (9.0/5)*tempC + 32;
        
        System.out.println(tempC + " in Centigrade is " + tempF + " in Fahrenheit");
    }
}