package com.xhx.advance.chap01;

class MyClass{
      static int a;
      int b;
}

public class TestMain{
      
    public static void main(String[] args){
          
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();

        mc1.a = 100;
        mc1.b = 200;
        mc2.a = 300;
        mc2.b = 400;
        System.out.println(mc1.a);
        System.out.println(mc1.b);
        System.out.println(mc2.a);
        System.out.println(mc2.b);
    }
}
