package com.xhx.exercise.chap03;

import java.util.*;

public class Factor{
      public static void main(String[] args){
            System.out.println("输入一个正整数!");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            long result = 0L;
            while(x<0){              
                System.out.println("输入错误，请重新输入！");
                x = sc.nextInt();
            }
            if(x==0){
                  result = 0;
            }else{
                  result = factor(x);
            }
            System.out.println(x+"!="+result);
      }

      public static long factor(int x){
            long result = 1L;
            for(;x>=1;x--){
                  result*=x;
            }
            return result;
      }
}
