package com.xhx.exercise.chap04;

public class Bubble{
      
    public static void main(String[] args){
        
        int num[] = {2,43,12,32,33,45,43,22,111,67,66};
        
        System.out.println("排序前");
        for(int i:num){
              System.out.print(i+" ");
        }

        System.out.println();

        //依次取一个数
        for(int i = 0;i<num.length;i++){
            //依次向后比较
            for(int j = i+1;j<num.length;j++)
                //冒泡，较大的数往后排
              if(num[i]>num[j]){
                    int a = num[i];
                    num[i] = num[j];
                    num[j] = a;
              }
        }
        
        System.out.println("排序后");
        for(int i:num){
              System.out.print(i+" ");
        }
        System.out.println();
    }
}
