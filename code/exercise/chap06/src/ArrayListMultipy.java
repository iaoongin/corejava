package com.xhx.exercise.chap06;

import java.util.*;

public class ArrayListMultipy{
      
    public static void main(String[] args){
          
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=10;i++){
            list.add(i);
        }
        
        Iterator it = list.iterator();
        int mul = 1;
        while(it.hasNext()){
//              int i = (Integer)it.next();
              mul=mul*(Integer)it.next();
        }
        System.out.println(mul);
    }
}
