package com.xhx.exercise.chap05;

public class BooleanTest{
      
    public static void main(String[] args){
          
        boolean b = false;

        System.out.println(b);

        String str = b+"";

        System.out.println(b);

        str = "true";

        System.out.println(Boolean.parseBoolean(str));
    }
}
