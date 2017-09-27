package com.xhx.exercise.chap06;

public enum RGBColor{
      RED("red"),BLUE("blue"),GREEN("green");

      private String name;
      private RGBColor(String name){
            this.name = name;
      }

      public static void main(String[] args){
            RGBColor c1 = RGBColor.BLUE;
            System.out.println(c1);

            for(RGBColor c:RGBColor.values()){
                  System.out.println(c);
            }
      }
}
