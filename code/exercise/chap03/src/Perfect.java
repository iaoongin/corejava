package com.xhx.exercise.chap03;

import java.util.*;


public class Perfect{
      
    public static void main(String[] args){
        for(int i = 1;i<=1000;i++){
            int  sum = getFactorsSum(i);
            if(i==sum){
                  System.out.println(i);
            }
        }
    }

    public static int getFactorsSum(int a){

        int sum = 0;

        for(int i = 1;i<a;i++){
              if(a%i==0){
                  sum+=i;
              }
        }

        return sum;
    }
}
