/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise09;

import java.util.Scanner;
import java.lang.Math;
public class solution09 {
   /*

   Print "What is the length of the ceiling?"
            'length' = input from user

    Print "What is the width of the ceiling?"
            'width' = input from user

    'area' = 'length'*'width'
    Print "the area is 'area'"

    Determine how many gallons will be needed to cover area
    totalGallon = 'area'/'gallon'

    Print out how many gallons of paint will need to be purchased for square feet by using if statement
    round up the amount of gallons needed

            if (area > 350) {
        Print ("you will need to purchase %d gallon of paint to cover %d square feet." , roundedGallon, area);
    }
else {
        Print ("You will need to purchase 1 gallon of paint to cover %d square feet." , area);


    }*/
    static final float gallon = 350;
    public static void main(String[] args){


        float length;
        float width;
        float area;



        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the ceiling?");
        length = scanner.nextInt();

        System.out.println("What is the width of the ceiling?");
        width = scanner.nextInt();

        area = length*width;

        System.out.printf("The area is %.0f\n", area);

        float roundedGallon = (int)Math.ceil(area/gallon);

        if (area > 350) {
            System.out.printf("you will need to purchase %.1f gallons of paint to cover %.0f square feet." , roundedGallon, area);

        }
        else {
            System.out.printf("You will need to purchase 1 gallon of paint to cover %.0f square feet.", area);
        }




    }

}
