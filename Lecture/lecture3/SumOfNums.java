public class SumOfNums{
    public static void main(String[] args){
        int num = 1;
        int total = 0;
        while (num <= 10) {
            total += num;
            num++;
        }
        System.out.println(total);
    }
}