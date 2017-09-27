package com.xhx.advance.ch01;

public class StaticTest{
      
    private int age;
    private static int num;

    public StaticTest(){
          age++;
          num++;
    }

    public void test(){
          System.out.println("in test...");
          sTest();
    }

    public static void sTest(){
          static int a;          
          System.out.println("in sTest...");
    }

    public static void main(String[] args){
          System.out.println(StaticTest.num++);
          StaticTest.sTest();

          StaticTest st1;// = new StaticTest();
          System.out.println(StaticTest.num);
          st1 = new StaticTest();
          System.out.println(st1.age+" "+st1.num);

          StaticTest st2 = new StaticTest();
          System.out.println(st2.age+" "+st2.num);

    }
}
