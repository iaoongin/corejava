package com.xhx.basic.ch04;

public class ArrayTest{

     static int array[];

      public static void main(String[] args){
                int[] a = {1,2,3};

                System.out.println("成员数组变量，默认值："+array);

                int[] b = new int[10];
                for(int i:b){
                    System.out.print(i);
                }

      }
}
