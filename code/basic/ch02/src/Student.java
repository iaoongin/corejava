package com.xhx.basic.ch02;

public class Student{
      private int id;
      private String name;

      public Student(int id,String name){
            this.id = id;
            this.name = name;
      }

      public void introduce(){
            System.out.println("Hey ! I am "+name);
      }
}


