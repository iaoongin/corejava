package com.xhx.exercise.chap05;

public class Circle extends Shape{
      
    protected double r;

    public Circle(){
          r = 1.0;
    }

    public Circle(double r){
          this.r = r;
    }

    public Circle(int x,int y,double r){
          super.x = x;
          super.y = y;
          this.r = r;
    }

    public void draw(){
          System.out.println("draw in circle "+x+" "+y+" "+r);
    }
}
