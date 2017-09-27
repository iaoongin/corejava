package com.xhx.exercise.chap06;

public interface Person{
      public void setData(String name,String sex,String birthday);
      public String getData();
}

class Student implements Person{

      private int sID;
      private String speciality;
      private String name;
      private String sex;
      private String birthday;

      public void setData(String name,String sex,String birthday){
            this.name = name;
            this.sex = sex;
            this.birthday = birthday;
      }
      public String getData(){
            return "sID="+this.sID+" speciality="+this.speciality+" name="+this.name+" sex="+this.sex+" birthday="+birthday;
      }

      public void setSID(int sID){
            this.sID = sID;
      }

      public void setSpeciality(String speciality){
            this.speciality = speciality;
      }
}
