package com.xhx.exercise.chap06;

import java.util.*;

class Student implements Comparable{
      
    private int id;
    private String name;
    private int score;

    public int getId(){
          return this.id;
    }

    public String getName(){
          return this.name;
    }

    public int getScore(){
          return this.score;
    }

    public Student(int id,String name,int score){
          this.id = id;
          this.name = name;
          this.score = score;
    }

    public String toString(){
          return "[id="+this.id+" name="+this.name+" score="+this.score+"]";
    }


    public int compareTo(Object o){
          if(o instanceof Student){
                Student s = (Student)o;
              if(this.name.equals("tom")){
                    return -1;
              }else if(!this.name.equals("tom")){
                    return 1;
              }
             if(this.score>s.getScore()){
                    return -1;
              }else if(this.score<s.getScore()){
                    return 1;
              }else{
                    return 1;
              }
          }else{
                return 1;
          }
    }
}

public class StudentTest{
      public static void main(String[] args){
            
          Set<Student> set = new TreeSet<Student>(/*new MyStudentComparator<Student>()*/);
          set.add(new Student(1,"lili",70));
          set.add(new Student(3,"jack",89));
          set.add(new Student(2,"henly",76));
          set.add(new Student(6,"tom",66));
          set.add(new Student(5,"lili",90));
          set.add(new Student(6,"tom",66));
          set.add(new Student(7,"timi",66));

          int i = 1;
          for(Student s:set){
                
                System.out.println(i+++": "+s);
          }
      }
}

class MyStudentComparator<T> implements Comparator<T>{
      public int compare(T o1,T o2){
          /*
            if(o1 instanceof 
            if(o1.getName().equals("tom")){
                 return -1;
            }
            if(o1.getScore>o2.getScore){
                 return -1;
            }else if(o1.getScore>o2.getScore){
                 return 1;
            }else{
                 return 0;
            }
            */
          return 1;
      }

     /*public  boolean equals(Object o){
           return true;
     }*/
}
