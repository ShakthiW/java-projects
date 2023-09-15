import java.util.*;

public class InitialGen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st name: ");
        String firstName = input.next();
        System.out.print("Enter your 2nd name: ");
        String secondName = input.next();
        String ini_1 = firstName.substring(0,1);
        String ini_2 = secondName.substring(0,1);
        System.out.println("Your initials are: "+ ini_1 + ini_2);
    }
}