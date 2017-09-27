package com.xhx.exercise.chap03;

import java.util.*;

public class Flower{
      public static void main(String[] args){
            List<Integer> result = new ArrayList<Integer>();

            for(int i = 1;i<=9;i++){
                  for(int j = 0;j<=9;j++){
                        for(int k = 0;k<=9;k++){
                              int a = 100*i+10*j+1*k;
                              int b = i*i*i+j*j*j+k*k*k;
                              if(a==b){
                                    result.add(a);
                              }
                        }
                  }
            }

            for(int r:result){
                System.out.print(r+" ");
            }
            System.out.println();
      }
}
