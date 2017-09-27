package com.xhx.exercise.chap06;

public class GetClassTest{
      
    public static void main(String[] args){
      new B();    
    }
}

class A{
      public A(){
            System.out.println(getClass());
      }
}

class B extends A{
      
}
