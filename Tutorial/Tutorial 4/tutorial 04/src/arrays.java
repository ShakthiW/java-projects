import java.util.Scanner;
public class arrays{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[10];
        int failed = 0;
        int sum = 0;
        for (int i=0; i<10; i++){
            System.out.print("Enter the marks: ");
            int mark = input.nextInt();
            marks[i] = mark;
            if (mark < 40){
                failed += 1;
            }
        }
        for (int j=0; j<10; j++){
            sum += marks[j];
            System.out.print(marks[j] + " ");
        }
        double avg = sum / marks.length;
        System.out.println("\nAverage mark is : "+ avg);
    }
}