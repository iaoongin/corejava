package com.xhx.exercise.chap03;

public class LoopTest{
      public static void main(String[] args){
            int i = 1;
            int sum = 1;
            while(i<=10){
                  sum*=i;
                  i++;
            }
            System.out.println("While计算为"+sum);

            i=1;
            sum = 1;
            do{
                  sum*=i;
                  i++;
            }while(i<=10);
            System.out.println("do while计算为"+sum);

            i=1;
            sum = 1;
            for(;i<=10;i++){
                  sum*=i;
            }
            System.out.println("for计算为"+sum);

      }
}
