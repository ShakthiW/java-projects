public class SumOfSquares{
    public static void main(String[] args){
        int num = 1;
        int total = 0;
        do{
            total += (num*num);
            num++;
        } while (num <= 10);
        System.out.println(total);
    }
}