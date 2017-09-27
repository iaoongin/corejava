package com.xhx.exercise.chap06;

public class ExceptionTest{
    
    public static void main(String[] args){
          
//        throw new MyCheckedException();
          throw new MyUncheckedException();
    }
}

class MyCheckedException extends Exception{

}

class MyUncheckedException extends RuntimeException{
      
}
