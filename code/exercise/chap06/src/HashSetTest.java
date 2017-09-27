package com.xhx.exercise.chap06;

import java.util.*;

public class HashSetTest{
      
    public static void main(String[] args){
          
        HashSet<Student> set = new HashSet<Student>();

        Student stu = new Student(7,"yyy","female",22);
        System.out.println(stu.hashCode());

        set.add(new Student(3,"Alen","female",23));
        set.add(new Student(1,"Tom","male",20));
        set.add(new Student(3,"Alen","female",23));
        set.add(new Student(4,"Brown","male",22));

        for(Student s:set){
              System.out.println(s);
        }
        System.out.println("------");
        for(Student s:set){
              System.out.println(s);
        }
        
    }
}

