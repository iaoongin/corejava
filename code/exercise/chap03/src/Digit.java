package com.xhx.exercise.chap03;

import java.util.*;

public class Digit{

      public static void main(String[] args){
          List<Integer> result = new ArrayList<Integer>();
          for(int i = 1;i<=4;i++){
                for(int j = 1;j<=4;j++){
                    for(int k = 1;k<=4;k++){
                        if(i==j||i==k||j==k){
                            continue;
                        }else{
                            result.add(100*i+10*j+1*k);
                        }
                     }
                }
          }
          System.out.println("一共有"+result.size()+"个,为：");
          

          for(int a:result){
                System.out.print(a+"  ");
          }

          System.out.println();
      }
}
