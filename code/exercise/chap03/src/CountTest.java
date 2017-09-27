package com.xhx.basic.ch03;

public class CountTest{
      public static void main(String[] args){
           forTest(); 
              whileTest();
            doTest();
      }

      public static void forTest(){
            int sum = 0;
            for(int i = 1;i<=100;i++){
                  sum+=i;
//                  System.out.print(i+" ");
            }

            System.out.println("for:sum="+sum);
      }

      public static void whileTest(){
          int sum = 0;
          int i = 1;
            while(i<=100){
                  sum+=i;
                  i++;
            }
            System.out.println("while:sum="+sum);
      }

      public static void doTest(){
            int i = 1;
            int sum = 0;
            do{
                  sum+=i;
                  i++;
            }while(i<=100);
            System.out.println("do:sum="+sum);
      }
}
