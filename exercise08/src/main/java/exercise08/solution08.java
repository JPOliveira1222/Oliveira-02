/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise08;

import java.util.Scanner;

public class solution08 {

    /*
    Print "How many people?"
            'people' = input from user

    Print "How many pizzas do you have?"
            'pizza' = input from user

    Print "How many slices per pizza?"
            'slice' = input from user

    Determine total amount of slices
	'pizza'*'slice'= 'slicesTotal

    Print " 'people' people with 'pizza' pizzas ('slicesTotal' slices)

    Determine how many slices each person gets and leftovers
	'sliceTotal'/'people' = 'slicePerson'
            'leftover'= 'sliceTotal'%'people'

    Print "Each person gets 'slicesPerson' pieces of pizza.\nThere are 'leftover' pieces"
    */

    public static void main(String[] args){

        int pizza;
        int people;
        int slice;
        int sliceTotal;
        int leftover;
        int slicePerson;

        Scanner scanner = new Scanner(System.in);



        System.out.println("How many people are there?");
        people = scanner.nextInt();

        System.out.println("How many pizzas do you have?");
        pizza = scanner.nextInt();

        System.out.println("How many slices per pizza?");
        slice = scanner.nextInt();


        sliceTotal = pizza*slice;
        leftover = sliceTotal%people;
        slicePerson = sliceTotal/people;

        System.out.printf("Each person gets %d pieces of pizza.\nThere are %d pieces leftover", slicePerson, leftover);






    }
}
