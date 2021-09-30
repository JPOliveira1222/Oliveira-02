/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise15;
import java.util.Scanner;

public class solution15 {

    /*
     Print "What is the password?"
     userPass = input from user

     compare to see if password is correct
     Print "I don't know you." if password is incorrect

     else print "Welcome!" is the password is correct
     */

    static final String password = "abc$123";
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("What is the password?");
        String userPass = scan.next();


        if (userPass.equals(password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you");
        }

    }
}
