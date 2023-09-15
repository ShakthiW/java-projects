import java.util.ArrayList;

public class BoubleSortWithObjects {
    static Person[] persons = new Person[6];

    private static void BubbleSort(Person[] array) {
        int bottom = array.length - 2;
        int temp;
        boolean exchanged = true;

        while (exchanged) {
            exchanged = false;
            for (int i = 0; i <= bottom; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    exchanged = true;
                }
            }
            bottom--;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Shakthi", 20);
        Person p2 = new Person("Abdul", 19);
        Person p3 = new Person("Person0", 22);
        Person p4 = new Person("Person1", 65);
        Person p5 = new Person("Person2", 35);
        Person p6 = new Person("Person3", 12);

        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;
        persons[3] = p4;
        persons[4] = p5;
        persons[5] = p6;

        BubbleSort(persons);
    }
}
