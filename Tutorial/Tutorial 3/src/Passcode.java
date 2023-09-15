import java.util.Scanner;
public class Passcode {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int attempts = 4;
        int passcode = 486251;
        while (attempts != 0) {
            System.out.print("Enter the password: ");
            int givenPassword = input.nextInt();
            if (givenPassword == passcode){
                break;
            }
            attempts--;
            System.out.println("Password is incorrect, please try again... You have "+ attempts + " attempts left");
        }
        System.out.println("Congratulations you got the password correct!!!");
    }
}
