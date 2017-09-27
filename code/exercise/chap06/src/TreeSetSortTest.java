package com.xhx.exercise.chap06;

import java.util.*;

public class TreeSetSortTest{
      
    public static void main(String[] args){
          
        TreeSet<String> set = new TreeSet<String>(new MyAscComparator());

        set.add("HashSet");
        set.add("ArrayList");
        set.add("TreeMap");
        set.add("HashMap");
        set.add("TreeSet");
        set.add("LinkedList");

        for(String s:set){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
    class MyAscComparator implements Comparator{
          public int compare(Object o1,Object o2){
                if( (o1 instanceof String) && (o2 instanceof String) ){
                      String s1 = (String) o1;
                      String s2 = (String) o2;
                      return s1.compareTo(s2);
                }else{
                    return -1;
                }
          }
    }

