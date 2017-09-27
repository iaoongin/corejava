package com.xhx.exercise.chap05;

public class Shape{
      
    protected int x;
    protected int y;

    public Shape(){
    
        System.out.println("无参构造器");
    
    }
/*
    public Shape(int... a){
          System.out.println("可变参数构造器");
          System.out.println("int...a :"+a);
          System.out.println("int...a[0] :"+a[0]);
          System.out.println("int...a[1] :"+a[1]);
    }

    public static void main(String[] args){
          new Shape(1);
        int array[] = {1,2};
          new Shape(array);
        new Shape();
    }
*/
    public Shape(int x,int y){
          this.x = x;
          this.y = y;
    }

    public void draw(){
          System.out.println("Shape draw");
    }
}
