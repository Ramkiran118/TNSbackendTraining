package com.kprit.tns.exception;
import java.util.*;
public class ATMmain {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ATM ob=new ATM();
        
        System.out.println("Enter the Pin");
        int pin = sc.nextInt();

        try{
            ob.validatepin(pin);
            
        }
        catch(InvalidePinException e){
            e.printStackTrace();
            return;
        }

    while(true){
        System.out.println("---- ATM Menu ----");
        System.out.println("1. withdraw");
        System.out.println("2. Deposite amount.");
        System.out.println("3. check balance");
        System.out.println("4. exit" );
        System.out.println("Enter the button :");

        int button =sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Enter the Amount to Withdraw :");
                double amount = sc.nextDouble(); 
                try{
                    ob.withdraw(amount);
                    }
                catch(InsufficientBalException e){
                    e.printStackTrace();
                    }       
            break;

            case 2:
                    System.out.println("Enter the amount to deposite :");
                    double depositeAmt = sc.nextDouble();
        
                    ob.Deposite(depositeAmt);
            break;

            case 3:
                    System.out.println("your Balance is "+ob.getBalance());
            break;
        
            case 4:
                    System.out.println("Thankyou for using our ATM .");
            return;

            default:
                    System.out.println(" Invalide Button ");
                        }
                }
        }
}