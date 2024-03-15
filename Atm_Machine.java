package codsoft;

import java.util.Scanner;

public class Atm_Machine extends UserAccount {
       static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Atm_Machine atm = new Atm_Machine();


        char cases;
        do {
            System.out.println("What you want to do : ");
            System.out.println("Select One Option ");
            System.out.println("\n");
            System.out.println("1 : Withdraw");
            System.out.println("2 : Deposit");
            System.out.println("3 : Check Balance");

        int option = sc.nextInt();
            switch (option) {
                case 1:
                    atm.withdraw();
                    break;

                case 2:
                    atm.deposit();
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                default:
                    System.out.println("Wrong Option, Please choose 1, 2, or 3");
            }
            System.out.println("Do you want to perform again :");
            System.out.println("Yes or No");
            cases = sc.next().charAt(0);
        }
        while(cases == 'y' || cases == 'Y');

    }
    void withdraw(){
        System.out.println("Enter Amount to withdraw : ");
        int number = sc.nextInt();
        if(number > amount){
            System.out.println("Do not have sufficient balance");
        }
        else if(number <= amount){
            amount -=number;
            System.out.println("successfully amount withdraw  : "+ number);
        }

    }

    void deposit(){
        System.out.println("Enter amount to deposit : ");
        int number = sc.nextInt();
        amount += number;

        System.out.println("Rs " +number+ " Deposited");
    }

    void checkBalance(){
        System.out.println("Your Balance is "+amount);
    }




}
