package com.xhx.exercise.chap02.exercise2;

public class Teacher
{
        public String name;     //姓名
        public int age;         //年龄
        public double salary;   //薪水

        //用于年龄增加的方法
        public void increaseAge(){
            age++;
         }

        //计算工资
        public void increaseSalary(int money){
              this.salary+=money;
        }
}
