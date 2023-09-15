import java.util.Scanner;

public class AgeStatus{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        if (age <= 0){
            System.out.println("Invaild age.");
        
        } else if (age >= 18){
                System.out.println("Over 18");
        
        } else if (age < 18){
                System.out.println("Under 18");
        }
    }
}    