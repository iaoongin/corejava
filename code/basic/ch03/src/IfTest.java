package com.xhx.basic.ch02;

import java.util.*;

public class IfTest{
      public static void main(String[] args){
            int score = 30;
            Scanner sc = new Scanner(System.in);
            System.out.println("输入成绩");
            score = sc.nextInt();
            mark(score);
      }

      public static void mark(int c){
            if(c>=90&&c<=100){
                System.out.println("优秀");
            }else if(c>=80){
                System.out.println("良好");
            }else if(c>=70){
                System.out.println("中等");
                  
            }else if(c>=60){
                  
                System.out.println("合格");
            }else{
                System.out.println("不及格");
                  
            }
      }
}
