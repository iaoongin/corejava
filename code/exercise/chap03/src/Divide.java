package com.xhx.exercise.chap03;

import java.util.*;

public class Divide{

     static List<Integer> fac = new ArrayList<Integer>();

      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("输入一个正整数:");
            int n = sc.nextInt();
            while(n<=0){
                  System.out.println("请重新输入！");
                   n = sc.nextInt();
            }

            if(n==1){
                  fac.add(1);
            }else{
                divide(n);
            }

            System.out.print("质因数分解:"+n+"=");

            for(int i = 0;i<fac.size();i++){
                System.out.print(fac.get(i));
                if(i!=fac.size()-1){
                      System.out.print("*");
                }
            }
            System.out.println();
      }

      public static void divide(int num){
            if(num>=2){
                for(int i = 2;i<=num;i++){
                    if(num%i==0){
                          fac.add(i);
                        if(num!=i){
                                divide(num/i);
                        }
                        return;
                    }
                }
            }else{
                 return; 
            }
      }
}
