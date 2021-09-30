/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise21;

import java.util.Scanner;

public class solution21 {

    /*
        Print "Enter the number of the month:"
        'number' = input from user

       Use a switch case to determine what month the number correlates to

       Print "the name of the month is 'month'"

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of the month: ");

        int month = scan.nextInt();
        String monthString = null;

        switch (month) {
            case 1 -> monthString = "January";
            case 2 -> monthString = "February";
            case 3 -> monthString = "March";
            case 4 -> monthString = "April";
            case 5 -> monthString = "May";
            case 6 -> monthString = "June";
            case 7 -> monthString = "July";
            case 8 -> monthString = "August";
            case 9 -> monthString = "September";
            case 10 -> monthString = "October";
            case 11 -> monthString = "November";
            case 12 -> monthString = "December";
        }

        if (month >=1 && month <12) {
            System.out.println("The name of the month is " + monthString);
        }else{
            System.out.println("That number does not correspond with a month");
        }




    }

}
