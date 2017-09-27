package com.xhx.exercise.chap05;

public class Account{
      
    //余额
    protected double balance;

    public Account(){}
    
    public Account(double balance){
          this.balance = balance;
    }

    //
    public double getBalance(){
          return this.balance;
    }

    //存钱
    public boolean deposit(double amount){
        this.balance += amount; 
        return true;
    }

    //取钱
    public boolean withdraw(double amount){
        if(amount>this.balance){
              return false;
        }else{
            this.balance-=amount;
            return true;
        }
    }



}
