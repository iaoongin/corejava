package com.xhx.exercise.chap06;

public class ObjectTest{
      
    public static void main(String[] args){
          
        Object o = test("tom");
        
        Student s = (Student)o;

        System.out.println(s.getId()+s.getName());
    }

    public static Object test(String cn){
          
          Student stu = new Student(1,cn);
          
          return stu;
    }
}

class Student{
      private int id;
      private String name;

      public Student(int id,String name){
            this.id = id;
            this.name = name;
      }

      public int getId(){return this.id;}

      public String getName(){return this.name;}

      public String toString(){return "["+id+name+"]";}
}
