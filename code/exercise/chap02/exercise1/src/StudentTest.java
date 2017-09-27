package com.xhx.exercise.chap02;

public class StudentTest{
    public static void main(String[] args){
    
      Student stu = new Student();

      stu.name="文希";
      stu.sex='女';
      stu.age=20;


      System.out.println("姓名:"+stu.name);
      System.out.println("性别:"+stu.sex);
      System.out.println("年龄:"+stu.age);
    }
}
