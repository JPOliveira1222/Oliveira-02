/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise12;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class solution12 {

    /*Print "enter the principal: "
            'principal' = input from user

    Print "Enter the rate of interest: "
            'interest' = input from user/100

    Print "Enter the number of years: "
            'years' = input from user

    determine final investment
            investment = principal(1+rate*years);

    round investment to the nearest penny
    BigDecimal investment = new BigDecimal(rate).setScale(2, RoundingMode.CEILING);
    double finalInvestment = investment.doubleValue();


    Print ("After %d years at %d%, the investment will be worth $%d.", years, interest, finalInvestment)

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal:");
        float principal = scanner.nextInt();

        System.out.println("Enter the rate of interest:");
        float interest = scanner.nextFloat();
        float rate = interest/100;

        System.out.println("Enter the number of years:");
        float years = scanner.nextInt();

        float investment = principal*(1+(rate*years));

        BigDecimal roundingInvestment = new BigDecimal(investment).setScale(2, RoundingMode.CEILING);
        float finalInvestment = roundingInvestment.floatValue();

        System.out.println("After " +years+ " years at " +interest+ "%, the investment will be worth $" + finalInvestment);



    }



}
