package com.xhx.exercise.chap06;

public class DivisionByZero{
      
    public static void division1(){
          try{
                int a = 10;
                int b = 0;
                int c = a/b;
          }catch(Exception e){
                System.out.println(e);
          }
    }

    public static void division2() throws ArithmeticException{
          int a = 10;
          int b = 0;
          int c = a/b;
    }

    public static void main(String[] args) throws Exception{
//        division1();
          division2();
    }
}
