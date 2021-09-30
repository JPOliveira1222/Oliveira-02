/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exercise14;

import java.util.Scanner;

public class solution14 {

    /*
    Print "what is the order amount?"
    'order' = input from user

    Print "what is the state?"
    'state' = input from user

    Print "The subtotal is $'order'"

    Determine if the state is WI, if so, 'tax' = 5.5/100
    Print "The tax is $'tax'"
    determine the total if in WI
    'subtotal' = 'order'+'tax'
    round to the nearest cent

    Print the total is 10.55


     */
    static final double taxRate = 5.5;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double order = scan.nextInt();

        System.out.println("What is the state?");
        String state = scan.next();

        System.out.println("In " +state);

        if (state.equals("WI")) {
            System.out.printf("The subtotal is %.2f\n", order);
            double finalTax = taxRate / 10;

            System.out.printf("The Tax is $%.2f\n", finalTax);

            order += finalTax;
            System.out.println("the total is $" +order);
            System.exit(0);
        }
        System.out.println("the total is $" +order+ ".");
        }

    }
