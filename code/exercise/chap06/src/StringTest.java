package com.xhx.exercise.chap06;

import java.util.*;

public class StringTest{
      
    public static void main(String[] args){
          
        String str = "asdzxczzxvzewefwoahfzgvvmbeaop";

        System.out.println(str);

        print(str);

        printAndCount(str);
    }

    public static void print(String str){
          char[] array = str.toCharArray();
          Set<String> set = new TreeSet<String>();
          for(char c:array){
               set.add(c+""); 
          }
           
          for(String s:set){
               System.out.print(s); 
          }
          System.out.println();
    }

    public static void printAndCount(String str){
          
        char[] array = str.toCharArray();

        List<Character> list = new ArrayList<Character>();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char c:array){
              if(!list.contains(c)){
                  list.add(c);  
              }
              if(!map.containsKey(c)){
                    map.put(c,1);
              }else{
                   int i= map.get(c);
                    map.put(c,++i);

              }
        }

        for(char c:list){
              System.out.print(c);
        }

        System.out.println();

        for(char c:map.keySet()){
              System.out.print(c+" "+map.get(c)+"\n");
        }

        System.out.println();

        System.out.println(map.entrySet());
    }
}
