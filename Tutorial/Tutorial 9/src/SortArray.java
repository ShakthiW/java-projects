import java.util.Scanner;

public class SortArray {
    static int[] array = {23, 67, 45, 34, 90, 1, 4, 78, 45};

    private static void BubbleSort(int[] array) {
        int bottom = array.length - 2;
        int temp;    boolean exchanged = true;
        while (exchanged) {
            exchanged = false;
            for (int i = 0; i <= bottom; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    exchanged = true;
                } }
            bottom--; }
    }

    public static int BinarySearch(int[] array, int searchValue){
        int low=0, high=array.length-1, mid=(low + high)/2;
        while (low <= high && array[mid] != searchValue) {
            if (array[mid] < searchValue) {
                low=mid+1;
            } else {
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if (low > high) {
            mid = -1;
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BubbleSort(array);

        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if (i != array.length-1) {
                System.out.print(", ");
            } else {
                System.out.print(". ");
            }
        }

        System.out.print("\nEnter the number you want to find: ");
        int searchValue = input.nextInt();

        int number = BinarySearch(array, searchValue);

        if (number == -1){
            System.out.println("The number not found in the array");
        } else {
            System.out.println("The number found at the index, " + number);
        }
    }
}
