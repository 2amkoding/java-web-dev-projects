package org.launchcode;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        Double length = input.nextDouble();

        System.out.println("Enter width: ");
        Double width = input.nextDouble();

        Double area = length*width;
        System.out.println("Area is: " + area);
    }
}
