/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exercise16;


import java.util.Scanner;
public class solution16 {

    /*
    Print what is your age?
    'age' = input from user

    determine if user is old enough to drive

    if user is >= 16
        Print "You are old enough to legally drive."
     else
        print "You are not old enough to legally drive."

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scan.nextInt();

        String msg = (age >= 16)
                ? "You are legally old enough to drive."
                : "You are not legally old enough to drive.";
        System.out.println(msg);


    }
}
