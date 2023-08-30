package studios.areaofacircle;

import java.util.Date;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a radius: ");

            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine();
            }
        }
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle with a radius of " + radius + " is " + area);

            input.close();
        }
    }
