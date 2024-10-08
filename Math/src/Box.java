/*
Created by: Dany
Created on 12/10/2022 : 10:17
This is program to calculate the perimeter, area and volume of the box
*/

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double high, wide, deep, perimeter, area, volume;

        System.out.print("Enter the high(cm) = ");
        high = scanner.nextDouble();
        System.out.print("Enter the wide(cm) = ");
        wide = scanner.nextDouble();
        System.out.print("Enter the deep(cm) = ");
        deep = scanner.nextDouble();

        perimeter = 4*high + 4*wide + 4*deep;
        area = 2*(high + wide + deep);
        volume = high*wide*deep;

        System.out.println("____________________________" +
                "\n\tPerimeter = " + perimeter +
                " cm\n\tArea = " + area +
                " cm\n\tvolume = " + volume + " cm");
    }
}
