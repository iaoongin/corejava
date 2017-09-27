package com.xhx.exercise.chap05;

import java.util.*;

public class ArraySortTest{
      
    public static void main(String[] args){
    int[] a = {1,5,3,7};

    Arrays.sort(a);

    for(int i = 0;i<a.length;i++){
         System.out.print(a[i]+" ");
    }
    }
}
