public class TheFibonacciSeries {
    public static void main (String[] args){
        int count = 1;
        int num1 = 1;
        int num2 = 1;
        System.out.print(num1 + ", ");
        while (count <= 10){
            System.out.print(num1 + ", ");
            int nextNum = num1 + num2;
            num2 = num1;
            num1 = nextNum;
            count++;
        }
        System.out.print("...");
    }
}
