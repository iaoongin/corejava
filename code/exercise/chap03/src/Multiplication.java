package com.xhx.exercise.chap03;

public class Multiplication{

    public static void main(String[] args){
         //形式1
        System.out.println("形式1");
        for(int i = 1;i <= 9;i++){
              for(int j = 1;j <= i;j++){
                    System.out.print(i+"*"+j+"="+i*j+"\t");
            } 
              System.out.println();
        }

              System.out.println();

         //形式2
        System.out.println("形式2");
        for(int i = 1;i <= 9;i++){
              for(int j = 9;j >= i;j--){
                    System.out.print(i+"*"+j+"="+i*j+"\t");
            } 
              System.out.println();
        }

              System.out.println();

        //形式3
        System.out.println("形式3");
        for(int i = 1;i <= 9;i++){
              for(int k = i;k < 9;k++){
                System.out.print("\t");
              }
              for(int j = 1;j <= i;j++){
                    System.out.print(i+"*"+j+"="+i*j+"\t");
            } 
              System.out.println();
        }
              System.out.println();

         //形式4
        System.out.println("形式4");
        for(int i = 1;i <= 9;i++){
              for(int k = i;k > 1;k--){
                System.out.print("\t");
              }
              for(int j = 9;j >= i;j--){
                    System.out.print(i+"*"+j+"="+i*j+"\t");
            } 
              System.out.println();
        }

    }
}
