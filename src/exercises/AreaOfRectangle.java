package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the rectangle: ");
        int length = input.nextInt();
        System.out.print("What is the width of the rectangle: ");
        int width = input.nextInt();
        int area = (length * width);

        System.out.print("The area of the rectangle is : " + area);

    }
}
