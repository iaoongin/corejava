package com.xhx.exercise.chap06;

import java.util.*;

public class LimitGenericClass{
      
    public static void main(String[] args){
                List<? super Integer> li = new ArrayList<>();
                        
                Number n = new Integer(1);
                                
                Integer i = 1;

                li.add(i);
                li.add(2);
               //      li.add(n);  //不能add(Number)
                li.add(new Object()); 
                Integer in = (Integer)li.get(0);
                System.out.println(in);
    }
}
