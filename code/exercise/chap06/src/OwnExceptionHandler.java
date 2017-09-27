package com.xhx.exercise.chap06;

public class OwnExceptionHandler{
      
    public static void main(String[] args){
          
        try{
            new OwnExceptionSource().a();
        }catch(Exception e){
              System.out.println(e);
        }
    }
}

class OwnExceptionSource{
      public void a() throws OwnException{
            throw new OwnException();
      }
}

class OwnException extends Exception{
      
}
