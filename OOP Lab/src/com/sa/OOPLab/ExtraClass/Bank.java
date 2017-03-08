package com.sa.OOPLab.ExtraClass;

import java.util.Scanner;

/**
 * Created by akashs on 3/8/17.
 */
public class Bank {

    public static void displayMainMenu(){
        System.out.println("1. Create a bank account.");
        System.out.println("2. Deposit.");
        System.out.println("3. Withdraw.");
        System.out.println("4. Display bank account info.");
        System.out.println("5. Exit application.");
    }

    public static void createAccountMenu(){
        System.out.println("1. Create saving account.");
        System.out.println("2. Create current account.");
    }

    public static void main(String[] args) {
        BankAccount[]  bankAccounts = new BankAccount[100];
        int totalAccount = 0;

        Scanner scanner = new Scanner(System.in);
        while(true){
            displayMainMenu();
            System.out.println("Enter an option: ");
            int choice = scanner.nextInt();

            if(choice==1){

                createAccountMenu();
                int secondChoice = scanner.nextInt();

                if(secondChoice==1) {

                    System.out.println("Enter member name: ");
                    String name = scanner.next();
                    System.out.println("Enter account id: ");
                    String id = scanner.next();
                    System.out.println("Enter initial balance: ");
                    double balance = scanner.nextDouble();

                    BankAccount temp = new SavingAccount(name, id, balance);
                    bankAccounts[totalAccount] = temp;
                    totalAccount++;
                }

            }
            else if(choice==2){
                //Deposit
                System.out.println("Enter account id: ");
                String id = scanner.next();
                System.out.println("Enter initial balance: ");
                double balance = scanner.nextDouble();

                for(int i=0;i<totalAccount;i++){
                    if(bankAccounts[i].accountId.equals(id)){
                        bankAccounts[i].deposit(balance);
                        break;
                    }
                }
            }
            else if(choice==3){
                //withdraw
                System.out.println("Enter account id: ");
                String id = scanner.next();
                System.out.println("Enter initial balance: ");
                double balance = scanner.nextDouble();

                for(int i=0;i<totalAccount;i++){
                    if(bankAccounts[i].accountId.equals(id)){

                        boolean status = bankAccounts[i].withdraw(balance);
                        if(status){
                            System.out.println("Withdraw operation successful");
                        }
                        else{
                            System.out.println("Withdraw operation unsuccessful");
                        }

                        break;
                    }
                }
            }

            else if(choice==4){
                //Print bank info
            }
            else if(choice==5){
                break;
            }

        }

    }
}
