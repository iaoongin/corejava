package com.xhx.exercise.chap05;

public class CheckingAccount extends Account{
      
    private double overdraft;

    public CheckingAccount(double balance,double overdraft){
        super(balance);
//          super(balance);
          this.overdraft = overdraft;
    }

    public CheckingAccount(double balance){
          super(balance);
          this.overdraft = 0.0;
    }

    //取钱
    public boolean withdraw(double amount){
          if(amount>(super.balance+overdraft)){
            return false;     
          }else{
              this.balance-=amount;
              return true;
          }

    }

    //
    public double getOverdraft(){
          return this.overdraft;
    }
}
