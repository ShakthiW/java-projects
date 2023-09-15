import java.util.Scanner;

public class PossitiveIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter a letter: ");
        String letter = input.next();
        while (num != 0) {
            System.out.print(letter.toUpperCase());
            num --;
        }
    }
}
