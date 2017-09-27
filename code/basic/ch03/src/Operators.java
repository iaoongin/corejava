package com.xhx.basic.ch03;

public class Operators{
      public static void main(String[] args){
            int i = 3;
            int j = 4;
            int k = -3;
            int a ;
            a=i<<j;
            System.out.println("3<<4="+(i<<j));
            a=i>>j;
            System.out.println("3>>4="+a);
            a=i>>>j;
            System.out.println("3>>>4="+a);
            a=k>>>j;
            System.out.println("-3>>>4="+a);
      }
}
