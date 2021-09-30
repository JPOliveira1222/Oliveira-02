/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */



package exercise19;

import java.util.Scanner;

public class solution19 {


    /*Print "Enter your wight in pounds: "
    float 'weight' = user input

    Print "Enter your height in inches: "
    float 'height' = user input

    determine the users BMI
    float BMI = ('weight' / ('height' x 'height')) *703;

    If (BMI < 18.5){
        Print "Your BMI is " + BMI+ ".\nYou are underweight. You should see your doctor."
    }elsif (BMI >= 18.5 && <=25){
        Print "Your BMI is " + BMI+ ".\nYou are within the ideal weight range."
     else{
        Print "Your BMI is " + BMI+ ".\nYou are overweight. You should see your doctor."


     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your wight in pounds: ");
        float weight = scan.nextInt();

        System.out.println("Enter your height in inches: ");
        float height = scan.nextInt();

        float BMI = ((weight/(height*height)) *703);


        if (BMI < 18.5){
            System.out.printf("Your BMI is %.1f.\nYou are underweight. You should see your doctor.", BMI);

        }else if (BMI >= 18.5 && BMI <= 25) {
            System.out.printf("Your BMI is %.1f.\nYou are within the ideal weight range.", BMI);

        }else {
            System.out.printf("Your BMI is %.1f.\nYou are overweight. You should see your doctor.", BMI);
        }




    }
}
