import java.util.*;

public class MtoCM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the meters value: ");
        float meters = input.nextInt();
        float centimeters = meters / 100;
        System.out.print(meters);
        System.out.print(" meters are ");
        System.out.print(centimeters);
        System.out.println(" centimeters.");
    }
}