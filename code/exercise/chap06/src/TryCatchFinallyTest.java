package com.xhx.exercise.chap06;

public class TryCatchFinallyTest{
      
    public static void main(String[] args){
          
        System.out.println(test());
    }

    public static boolean test(){
          try{
                return false;
          }finally{
              System.out.println("111");
                return true;
          }
    }
}
