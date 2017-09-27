package com.xhx.exercise.chap06;

import java.util.*;

public class TreeSetInner{
      
    public static void main(String[] args){
          
        Set<String> set = new TreeSet<String>(new MyTreeSetComparator());
        set.add("HashSet");
        set.add("ArrayList");
        set.add("TreeMap");
        set.add("HashMap");
        set.add("TreeSet");
        set.add("LinkedList");

        for(String s:set){
              System.out.println(s);
        }

    }

    static class MyTreeSetComparator implements Comparator{
          
        public int compare(Object o1,Object o2) throws ClassCastException{
              
            if(o1 instanceof String && o1 instanceof String){
                  
                String str1 = (String) o1;
                String str2 = (String) o2;

                return -1*str1.compareTo(str2);

            }else{
                  throw new ClassCastException();
            }
        }
    }
}
