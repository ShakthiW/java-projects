public class ArmstrongNumbers {
    public static void main(String[] args){
        int limit = 500;
        for (int i = 1; i<=limit; i++){
            int sum = 0;
            int num = i;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, 3);
                num /= 10;
            }
            if (i == sum) {
                System.out.print(i + ", ");
            }
        }
    }
}
