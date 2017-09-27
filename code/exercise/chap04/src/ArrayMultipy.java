package com.xhx.exercise.chap04;

public class ArrayMultipy{
      
    public static void main(String[] args){
          int[] array = {1,2,3,4,5,6,7,8,9,10};

          int res = 1;
          for(int i = 0;i<array.length;i++){
                res*=array[i];
          }

          System.out.println("数组个元素积为："+res);
    }
}

