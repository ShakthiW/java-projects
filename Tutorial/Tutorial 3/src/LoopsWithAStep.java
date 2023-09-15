public class LoopsWithAStep {
    public static void main(String[] args){
        for (int i=2; i<=5; i+=2){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
