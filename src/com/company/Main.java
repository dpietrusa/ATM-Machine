package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


double balance = 250.75;
boolean repeat = true;

Scanner choiceInput = new Scanner(System.in);


    do {

        System.out.print("Welcome to the Java ATM. Please select an option. \n");
        System.out.print("1 - Check Balance \n2 - Make Deposit \n3 - Make Withdraw \n");
        int number = choiceInput.nextInt();


        if (number == 1) {
            System.out.print("Your balance is $" + balance + ".\nMake another transaction? Y/N\n");
            int anotherTransaction = choiceInput.next().charAt(0);
            if (anotherTransaction == 'Y' || anotherTransaction == 'y') {
                repeat = true;
            } else {
                break;
            }

        } else if (number == 2) {
            System.out.print("Enter the deposit amount.\n");
            double depositAmount = choiceInput.nextDouble();
            balance = balance + depositAmount;
            System.out.print("Deposit complete! Make another transaction? Y/N\n");
            int anotherTransaction = choiceInput.next().charAt(0);
            if (anotherTransaction == 'Y' || anotherTransaction == 'y') {
                repeat = true;
            } else {
                break;
            }
        }

        else {
            System.out.print("Enter the withdraw amount.\n");
            double depositAmount = choiceInput.nextDouble();
            balance = balance - depositAmount;
            System.out.print("Withdraw complete! Make another transaction? Y/N\n");
            int anotherTransaction = choiceInput.next().charAt(0);
            if (anotherTransaction == 'Y' || anotherTransaction == 'y') {
                repeat = true;
            } else {
                break;
            }
        }


        } while (repeat = true);




    }
}

