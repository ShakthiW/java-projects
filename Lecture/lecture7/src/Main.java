import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Santa toy_1 = new Santa("Teddy bear", "TD0012", 1200, "Unisex", "General", 12000);
        System.out.println(toy_1.print("Toy 01"));

        Santa toy_2 = new Santa("Tea Set", "TE0123", 1000, "Girl", "Girls", 22000);
        System.out.println(toy_2.print("Toy 02"));

        Santa toy_3 = new Santa("Racing Car", "RC0342", 5000, "Boy", "Boys", 7000);
        System.out.println(toy_3.print("Toy 03"));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of teddy bears sold: ");
        int teddy_sold = input.nextInt();
        toy_1.sellToy(teddy_sold);

        System.out.print("Enter the number of racing cars produced: ");
        int race_produced = input.nextInt();
        toy_3.createToy(race_produced);

        System.out.print("Enter the new price of tea set: ");
        int tea_price = input.nextInt();
        toy_2.setPrice(tea_price);

        System.out.println(toy_1.print("Toy 01"));
        System.out.println(toy_2.print("Toy 02"));
        System.out.println(toy_3.print("Toy 03"));
    }
}