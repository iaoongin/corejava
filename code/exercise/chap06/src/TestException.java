package com.xhx.exercise.chap06;

public class TestException{
        public static void main(String[] args) {
                            
            try{
               System.out.println(args[0]);
               System.out.println(args[1]);
               System.out.println(args[2]);
            }catch(Exception e){
                  System.out.println(e);
            }
        }
}
