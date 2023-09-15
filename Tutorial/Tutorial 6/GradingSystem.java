import java.util.Scanner;

public class GradingSystem{
    public static void main(String[] args){
        Scanner grade = new Scanner(System.in);
        
        System.out.print("Enter the marks: ");
        double marks = grade.nextDouble();
        
        if ((marks > 100) | (marks < 0)){
            System.out.println("Invalid mark!");
        
        } else if (marks < 25){
            System.out.println("Grade: F");
        
        } else if (marks < 45){
            System.out.println("Grade: E");
        
        } else if (marks < 50){
            System.out.println("Grade: D");
        
        } else if (marks < 60){
            System.out.println("Grade: C");
        
        
        } else if (marks < 80){
            System.out.println("Grade: B");
            
        } else {
            System.out.println("Grade: A");
        
        }
    }
}