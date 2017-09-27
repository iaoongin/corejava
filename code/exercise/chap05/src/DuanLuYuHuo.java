package com.xhx.exercise.chap05;

public class DuanLuYuHuo{
      
    public static void main(String[] args){
          
        //短路与
        int a=0;
        System.out.println("a="+a+"短路与：");
        if(a==3&&((a=1)==1)){
              
            System.out.println("yed");
        }
        System.out.println("a="+a);

        //非短路与
        int b = 0;
        System.out.println("b="+b+"非短路与后");
        if(b==2&(b=1)==1){
              System.out.println("nat");
        }
        System.out.println("b="+b);
    }
}
