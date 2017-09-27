package com.xhx.exercise.chap06;

public class Pillar{
      private Geometry geometry;
      private double height;

      public Pillar(Geometry geometry,double height){
            this.geometry = geometry;
            this.height = height;
      }

      public double getVolume(){
            return this.geometry.getArea()*this.height;
      }

      public static void main(String[] args){
        
          Pillar p1 = new Pillar(new Circle(3),10);
          System.out.println("圆柱p1的体积"+p1.getVolume());
          Pillar p2 = new Pillar(new Rectangle(3,4),10);
          System.out.println("长方体柱p2的体积"+p2.getVolume());
            
      }
}

interface Geometry{
      public double getArea();
}

class Circle implements Geometry{
      private double r;

      public Circle(double r){
            this.r = r;
      }

      public double getArea(){
            return Math.PI*r*r;
      }
}

class Rectangle implements Geometry{
      private double width;
      private double height;

      public Rectangle(double width,double height){
            this.width = width;
            this.height = height;
      }

      public double getArea(){
            return width*height;
      }
}
