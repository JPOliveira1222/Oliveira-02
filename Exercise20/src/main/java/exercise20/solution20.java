/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */


package exercise20;



import java.util.Scanner;
public class solution20 {


    /*Print "What is the order amount? "
            'amount' = input from user

    Print "what state do you live in? "
            'state' = input from user

    check to see if 'state input is "Wisconsin"

            if so Print "What county do you live in? "
            'county' = input from user

            wisconsinTotal = (('amount'*'stateTaxWisconsin')+'amount')
    illinoisTotal = (('amount'*'stateTaxIllinois')+'amount')



    countyEuaTaxTotal = (('wisconsinTotal' *countyEuaTax) + 'amount')
    countyDunnTaxTotal = (('wisconsinTotal'*countyDunnTax) + 'amount')
    stateIllinoisTotal = (('stateTaxIllinois'*'amount) +'amount')

    check to see if county is Eua Clair
if Eua Clair Print "The tax is 'countyEuaTax'\n"The total is $" +countEuaTotal "


    check to see if county is Dunn
if dunn Print "The tax is countyDunnTax\nThe amount is $" +'countyDunnTotal' "


            if 'state' is Illinois
    print "The tax is 'stateTaxIllinois'\nThe total is $" +'stateIllinoisTotal'

            if none of those
    Print "the total is $" +'amount'

     */

    static final double countyEuaTax = 5/1000.0;
    static final double countyDunnTax = 4/1000.0;
    static final double stateTaxIllinois = 8/100.0;
    static final double stateTaxWisconsin = (5/100.0);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double amount = scan.nextDouble();

        System.out.println("what state do you live in? ");
        String state = scan.next();

        double wisconsinTotal = ((amount*stateTaxWisconsin)+amount);
        double countyDunnTotal = ((wisconsinTotal*countyDunnTax) + wisconsinTotal);
        double countyEuaTotal = ((wisconsinTotal *countyEuaTax) + wisconsinTotal);
        double stateIllinoisTotal = ((stateTaxIllinois*amount) +amount);
        double wisconsinTax = (amount*stateTaxWisconsin);
        double dunnTax = wisconsinTotal*countyDunnTax;
        double euaTax = wisconsinTotal*countyEuaTax;




        if (state.equalsIgnoreCase("wisconsin")) {
            System.out.println("What county are you in?");
            String county = scan.next();

            if (county.equalsIgnoreCase("Dunn")) {
                System.out.printf("The tax is $%.2f\nThe total is $%.2f", (dunnTax + wisconsinTax), countyDunnTotal);
            }
            else {
                boolean eua_clair = county.equalsIgnoreCase("Eua Clair");
                System.out.printf("The tax is $%.2f\nThe total is $%.2f", (euaTax + wisconsinTax), countyEuaTotal);
            }
        }else if (state.equalsIgnoreCase("Illinois")){
            System.out.println("The tax is " +stateTaxIllinois*10+ "$\nThe total is $" +stateIllinoisTotal);
        }else{
            System.out.println("The total is $" +amount);
        }


    }
}
