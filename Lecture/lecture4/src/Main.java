public class Main {

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public static double calcTotal(double num1, double num2){
        double total = num1 + num2;
        return total;
    }
    public static void main(String[] args) {
        double total = calcTotal(20.8, 34.7);
        System.out.println(total);
        System.out.println(calcTotal(1.3, 4.56));
    }
}