package com.xhx.exercise.chap06;

public class TryCatchTest{
      
    public static void main(String[] args){
         System.out.println(test()); 
    }

    public static int test(){
          
        try{
//              int a = 2/0;
//            throw "111";
              throw new MyException("这是一个异常！");
              
        }catch(Exception e){
              System.out.println(e.getMessage());
              return 1;
        }finally{
              return 2;
        }
        
        Exception e = new NullPointerException();
        throw e;
    }
}
class MyException extends Exception{
      public MyException(String name){
            super(name);
      }
}
