package com.xhx.exercise.chap05;

public class Rectangle extends Shape{
      protected double height;
      protected double width;

      public Rectangle(){
            height = 1.0;
            width = 1.0;
      }

      public Rectangle(double height,double width){
            this.height = height;
            this.width = width;
      }

      public Rectangle(int x,int y,double height,double width){
            super.x = x;
            super.y = y;
            this.height = height;
            this.width = width;
      }

      public void draw(){
            System.out.println("draw in rectangle x="+x+" y="+y+" height="+" width="+width);
      }
}
