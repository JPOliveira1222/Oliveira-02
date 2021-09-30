/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exersize07;

import java.util.Scanner;

public class solution07 {

    /*
    Print "What is the length of the room in feet?"
    'length' = length value input from user

    Print "What is the width of the room in feet?"
    'width' = width value input from user

    Give conversion factor a variable
    'conversion' = .09290304
    'areaFeet' = 'length'*'width'
    'areaMeters = 'areaFeet'*'conversion'

    Print "You entered dimensions of 'length' feet by 'width' feet."
    Print "The area is 'areaFeet' feet /n 'areaMeters' feet"

     */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int length;
        int width;
        double conversion =.09290304;
        int areaFeet;
        double areaMeters;

        System.out.println("What is the length of the room in feet?");
        length = scanner.nextInt();

        System.out.println("What is the width of the room in feet?");
        width = scanner.nextInt();

        System.out.printf("You entered dimensions of %d feet by %d feet.\n",length, width);

        areaFeet = length*width;
        areaMeters = areaFeet*conversion;

        System.out.printf("The area is \n%d square feet \n%f square meters", areaFeet, areaMeters);






    }

}
