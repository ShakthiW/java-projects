public class Recursion {
    public static void to100(int start, int end){
        if (start != end+1){
            System.out.println(start);
            start ++;
            to100(start, end);
        }
    }
    public static void main(String[] args) {
        to100(1, 100);
    }
}
