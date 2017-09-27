package com.xhx.exercise.chap06;

import java.util.*;

public class TreeSetTest2{
      
    public static void main(String[] args){
          TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>(){
                public int compare(Integer i1,Integer i2){
                    System.out.println(i1+" >>>>> "+i2);
                    return i1-i2;
/*                    if(i1%2==0&&i2%2!=0){
                        return 1;
                    }
                    if(i1%2!=0&&i2%2==0){
                      return -1;
                    }
                    if(i1%2==0&&i2%2==0){
                      return i2-i1;
                    }
                    if(i1%2!=0&&i2%2!=0){
                      return i1-i2;
                    }
                    return 0;
*/
               }
                
            }
          );
          for(int i = 1;i<10;i++){
              set.add(i);
          }
          for(int i:set){
                System.out.print(i+" ");
          }
          System.out.println();
    }
}
