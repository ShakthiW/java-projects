import java.util.Scanner;

public class LinearSearch {

    public static int LinearSearch(int[] array, int searchValue){
        int index = 0;
        while (index < array.length && array[index] != searchValue)
        { index++; }
        if (index == array.length) { return-1; }
        else { return index; }
    }
    public static void main(String[] args) {
        int[] numbers = {23, 67, 48, 94, 35, 18, 60, 76, 83};

        int searchValue;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the valur you want to search: ");
        searchValue = input.nextInt();

        int index = LinearSearch(numbers, searchValue);

        if (index == -1){
            System.out.println("Value not found in the array.");
        } else {
            System.out.println("value found at index ,"+ index);
        }
    }
}