import java.util.Scanner;
import  java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sideWidth = 0;
        double sideLength = 0;
        double mathPerimeter = 0;
        double mathArea = 0;

        boolean checkWidth = true;
        boolean checkLength = true;
        boolean checkSquare = true;

        //DO WHILE FOR WIDTH

        do {

        do {
            System.out.println("Please enter the variable for the 2 width sides of a rectangle below. (Negatives are not allowed)");

            if (scan.hasNextDouble()) {
                sideWidth = scan.nextDouble();

                //Buffer
                scan.nextLine();

                if (sideWidth > 0) {
                    System.out.println("Your Input : " + sideWidth + "\nIs Stored.");
                    checkWidth = false;
                } else {
                    System.out.println("You have entered an impossible value, we are not creating a vacuum buddy.");
                }
            } else {
                System.out.println("Letters are not allowed, use numbers for input.");
            }

        } while (checkWidth);

        //DO WHILE FOR LENGTH

        do {
            System.out.println("Please enter the variable for the 2 length sides of a rectangle below. (Negatives are not allowed)");

            if (scan.hasNextDouble()) {
                sideLength = scan.nextDouble();

                //Buffer
                scan.nextLine();

                if (sideLength > 0) {
                    System.out.println("Your Input : " + sideLength + "\nIs Stored.");
                    checkLength = false;
                } else {
                    System.out.println("You have entered an impossible value, we are not creating a vacuum buddy.");
                }
            } else {
                System.out.println("Letters are not allowed, use numbers for input.");
            }

        } while (checkLength);

        if (sideLength == sideWidth) {
            System.out.println("That is a square, this program is for rectangles.\nPal.");
            checkLength = true;
            checkWidth = true;
        } else {
            checkSquare = false;

            mathPerimeter = sideWidth + sideWidth + sideLength + sideLength;
            mathArea = sideLength * sideWidth;

            System.out.printf("The Width of your rectangle is : %9.2f", sideWidth);
            System.out.printf("\nThe Length of your rectangle is : %7.2f", sideLength);
            System.out.printf("\nThe Perimeter of your rectangle is : %5.2f", mathPerimeter);
            System.out.printf("\nThe Area of your rectangle is : %10.2f", mathArea);
        }

    } while (checkSquare);


    }
}