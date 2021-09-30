/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */
package exercise10;


import java.util.Scanner;
public class solution10 {
   /* Print "Enter the price of item 1:"
            'price1' = input from user
    Print "Enter the quantity of item 1:"
            'quantity1' = input from user
    Determine total of item 1
            'total1' = 'price1'*'quantity1'

    Print "Enter the price of item 2:"
            'price2' = input from user
    Print "Enter the quantity of item 2:"
            'quantity2' = input from user
    Determine total of item 2
            'total2' = 'price2'*'quantity2'

    Print "Enter the price of item 3:"
            'price3' = input from user
    Print "Enter the quantity of item 3:"
            'quantity3' = input from user
    Determine total of item 3
            'total3' = 'price3'*'quantity3'

    determine the subtotal
'subtotal' = 'total1'+'total2'+'total3'

    Determine the tax.
            finalTax = 'subtotal'*'tax'

    determine the total
'finalTotal' = 'subtotal'+'finalTax'

    Print ("Subtotal: %f\nTax: %f\nTotal: %f", subtotal, finalTax, finalTotal);

    */



    static final double Tax = 0.055;
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of item 1:");
        double price1 = scanner.nextInt();
        System.out.println("Enter the quantity of item 1:");
        double quantity1 = scanner.nextInt();
        double total1 = price1*quantity1;

        System.out.println("Enter the price of item 2:");
        double price2 = scanner.nextInt();
        System.out.println("Enter the quantity of item 2:");
        double quantity2 = scanner.nextInt();
        double total2 = price2*quantity2;

        System.out.println("Enter the price of item 3:");
        double price3 = scanner.nextInt();
        System.out.println("Enter the quantity of item 3:");
        double quantity3 = scanner.nextInt();
        double total3 = price3*quantity3;


        double subtotal = total1+total2+total3;
        double finalTax = subtotal*Tax;
        double finalTotal = subtotal+finalTax;

        System.out.printf("Subtotal: $%.02f\nTax: $%.02f\nTotal: $%.02f", subtotal,finalTax,finalTotal);












    }
}
