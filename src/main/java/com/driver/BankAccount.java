package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;
    private String accNo;



    public BankAccount(String name, double balance, double minBalance) {
      this.balance=balance;
      this.name=name;
      this.minBalance=minBalance;
    }

    public void createPassword(String str, int digit,int sum){
        if(str.length()>=digit){
            int count=0;   //checking its length
            for(int i=0;i<str.length();i++) count+=(str.charAt(i)-'a');
            if(count==sum) this.accNo=str;
            return;
        }
        for(int i=0;i<=9;i++) createPassword(str+Integer.toString(i),digit,sum);

        return;
    }
    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        createPassword("",digits,sum);
        return accNo;
    }

    public void deposit(double amount) {
        //add amount to balance
        this.balance+=amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
          this.balance-=amount;
    }

}