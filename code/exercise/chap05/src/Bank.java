package com.xhx.exercise.chap05;

public class Bank{
      
    private Customer[] customer;
    //客户数量
    private int custNum;

    public Bank(){
        this.custNum = 0;
        this.customer = new Customer[10];
    }

    public void addCustomer(Customer customer){
        if(custNum<=10){
            this.customer[custNum] = customer;
            this.custNum++;
        }else{
              
        }
    }

    public Customer getCustomer(int index)
    {
          return customer[index];
    }

    public int getCustomerNum(){
          return this.custNum;
    }
}
