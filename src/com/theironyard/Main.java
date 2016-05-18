package com.theironyard;


import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome User");
        System.out.println("Please Enter Name");

        Scanner input = new Scanner(System.in); //reads standard input

        String name = input.nextLine(); //Freezes until user hits Enter

        if (name.equalsIgnoreCase("")) {
            throw new Exception("Invalid Response");
        }

            System.out.println("Hello," + name);

        System.out.println("What would you like to do?");
        System.out.println(" Check balance " + " Withdraw Funds" + " Cancel ");
        String option = input.nextLine();

        if (option.equalsIgnoreCase("Check balance")) {
            System.out.println("Balance is $100");
        }

        else if (option.equalsIgnoreCase("Cancel")) {
            System.out.println("Thank you please come again");
        }

        else if (option.equalsIgnoreCase("Withdraw Funds")) {
            System.out.println("How much would you like to withdraw?");

            String num = input.nextLine();
            int numInt = Integer.valueOf(num);


            if (numInt > 100) {
                    System.out.println("Insufficient Funds");

                }

                else if (numInt <= 100) {
                System.out.println("Enjoy your money");
            }
        }
    }
}
