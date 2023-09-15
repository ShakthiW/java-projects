import java.util.Scanner;

public class DoubleRecursion {
    public static int function(int n){
        if (n==0) {
            return 1;
        } else if (n==1) {
            return 3;
        } else {
            return function(n-1) + function(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the term number: ");
        int n = input.nextInt();
        int ans = function(n);
        System.out.println("Ans is : " + ans);
    }
}
