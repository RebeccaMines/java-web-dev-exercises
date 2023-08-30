package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many miles have you driven: ");
        double miles = input.nextInt();
        System.out.print("How many gallons have you used: ");
        double gallons = input.nextInt();
        double milesPerGallon = (miles / gallons);

        System.out.print("Your mileage is " + milesPerGallon + "mpg");
    }
}
