package com.xhx.exercise.chap04;

public class ArrayExer3{
      
    public static void main(String[] args){
          
        int[] array1 = {2,3,5,7,11,13,17,19};

        System.out.print("array1=[");

        for(int i:array1){
              System.out.print(i+" ");
        }
        System.out.println("]");


        int[] array2 = array1;
        for(int i = 0;i<array2.length;i++){
              if(i%2==0){
                    array2[i]=i;
              }
        }

        for(int i:array2){
              System.out.print(i+" ");
        }
        System.out.println("]");

    }

}
