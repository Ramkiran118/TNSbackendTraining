package com.kprit.tns.exception;

public class ATM {
	private double balance = 10000.908;   // given a fixed amount in private.

	private final int SavedPin=1234;  // finalized a pin in private using Final keyword.
	
	public void validatepin(int EnteredPin) throws InvalidePinException{   
			if(SavedPin != EnteredPin) {
				throw new InvalidePinException("Enterd pin is Invalide");
			}
			else {
				System.out.println("Entered pin is Correct , Proceed ...");
			}
			
		}
		

		
		public void withdraw(double amount )throws InsufficientBalException{
			if(amount > balance) {
				throw new InsufficientBalException("Insufficient balance");
			}
			else {
				balance -= amount;
				
				System.out.println("The balance after the withdraw : "+ balance);
			}
		}

		public void Deposite(double amount){
			balance+=amount;
			System.out.println("the amount of " + amount +" Deposited Sucessfully.");
		}

		public double getBalance(){
			return balance;
		}

        
	}


