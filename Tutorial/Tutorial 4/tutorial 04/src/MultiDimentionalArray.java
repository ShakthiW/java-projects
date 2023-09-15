import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args){
        int[][] marks = new int[5][3];
        Scanner input = new Scanner(System.in);

        for (int row=0; row<5; row++){
            for (int col=0; col<3; col++){
                System.out.print("Enter Student "+ (row+1) + " mark " + (col+1) + " : ");
                marks[row][col] = input.nextInt();
            }
            System.out.println();
        }
        for (int row=0; row<5; row++){
            int sum = 0;
            for (int col=0; col<3; col++){
                sum += marks[row][col];
            }
            double avg = sum/3;
            System.out.println("The average mark of student " + (row+1) + " is " + avg);
        }
    }
}
