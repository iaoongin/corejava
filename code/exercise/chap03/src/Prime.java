package com.xhx.exercise.chap03;

import java.util.*;

public class Prime{
      
    public static void main(String[] args){
     
        int a = 101;
        int b = 200;

        List<Integer> result = new ArrayList<Integer>();

        for(int i =a;i<b;i++){
              boolean flag = false;
              for(int j = 2;j<i;j++){
                    if(i%j==0){
                          flag = false;
                          break;
                    }else{
                          flag = true;
                    }
              }
              if(flag==true){
                    result.add(i);     
              }
        }

        System.out.println("一共有"+result.size()+"个，为");

        for(int i:result){
              System.out.print(i+" ");
        }

        System.out.println();
    }
}
