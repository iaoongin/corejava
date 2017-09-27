package com.xhx.exercise.chap06;

public class Student{
      private int id;
      private String name;
      private String sex;
      private int age;

      public Student(int id,String name,String sex,int age){
            this.id = id;
            this.name = name;
            this.sex = sex;
            this.age = age;
      }

      public Student(){}

      public String toString(){
            return "[id="+this.id+" name="+this.name+" sex="+sex+" age="+this.age+"]";
      }

/*      public int hashCode(){
            return 1;
      }
*/
      public boolean equals(Object o){
            if(o instanceof Student){
                Student s = (Student) o;
                if(this.id == s.getId()&&this.name.equals(s.getName())&&this.sex.equals(s.getSex())&&this.age==s.getAge()){
                    return true;
                }else{
                      return false;
                }
            }else{
                return false;
            }
      }

      public int getId(){return this.id;}

      public String getName(){return this.name;}

      public String getSex(){return this.sex;}

      public int getAge(){return this.age;}

      public void setId(int id){this.id = id;}

      public void setName(String name){this.name = name;}

      public void setSex(String sex){this.sex = sex;}

      public void setAge(int age){this.age = age;}
}
