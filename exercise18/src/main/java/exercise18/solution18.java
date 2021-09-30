/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */


package exercise18;

import java.util.Scanner;

public class solution18 {
    /*Print "Press C to convert from Fahrenheit to Celsius\nPress F to convert from Celsius to Fahrenheit."
            'userChoice' = input from user
    allow upper or lowercase values

            Print = "Your choice: " +userChoice

    Using 'userChoice' determine if it is from Fahrenheit to Celsius or Celsius to Fahrenheit.

    If (userChoice.equals("C" && "c"){
        Print "Please enter the temperature in Fahrenheit: "
        float temp = user input
        float finalCelsius = (temp - 32)*5/9
        Print "The temperature in Celsius is " +finalCelsius)
    }else if (userChoice == F){
        Print "Please enter the temperature in Celsius: "
        float tempFar = user input
        float finalFahrenheit = ((temp*9)/5)) +32
        Print "The temperature in Fahrenheit is " +finalFahrenheit)
    }else{
        Print "Your input is not valid"

     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius\nPress F to convert from Celsius to Fahrenheit.");
        String userChoice = scan.next();

        if (userChoice.equals("C") || userChoice.equals("c")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            float temp= scan.nextInt();
            double finalCelsius = ((temp - 32)*(5.0/9.0));
            System.out.println("The temperature in Celsius is " +finalCelsius);
        } else if (userChoice.equals("F") || userChoice.equals("f")){
            System.out.println("Please enter the temperature in Celsius: ");
            float temp = scan.nextInt();
            float finalFahrenheit = (((temp*9)/5)+32);
            System.out.println("The temperature in Fahrenheit is " +finalFahrenheit);
        }else{
            System.out.println("Your input is not valid");


    }

    }





}
