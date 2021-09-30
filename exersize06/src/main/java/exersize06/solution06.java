/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */


package exersize06;

import java.util.Scanner;

import java.time.LocalDate;

public class solution06 {

    /*
    Print "What is your current age?"

    'age' = input from user

    Print "At what age would you like to retire?"

    'retire' = input from user

    determine amount of years left until retire.
    'time' = 'retire' - 'age'

    Print = "You have 'time' years left until you can retire."

    Acquire current date from system
    get the current year from the current date

    'year' = current year
    'year1' = 'year' + 'time'

    Print = "It's 'year', so you can retire in 'year1'"



     */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age?");
        String age1 = scanner.nextLine();

        System.out.println("At what age would you like to retire?");
        String retire1 = scanner.nextLine();

        int age = Integer.parseInt(age1);
        int retire = Integer.parseInt(retire1);

        int time = retire-age;

        System.out.printf("You have %d years left until you can retire.", time);

        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int year1 = year + time;


        System.out.printf("It's %d, so you can retire in %d.", year, year1);










    }


}


