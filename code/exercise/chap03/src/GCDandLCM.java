package com.xhx.exercise.chap03;

public class GCDandLCM{
      public static void main(String[] args){
//          System.out.println("输入两个数");
          int a = 44;
          int b = 32;

          System.out.println("最小公约数为:"+getGCD(a,b));
          System.out.println("最小公倍数为:"+getLCM(a,b));
      }

      public static int getGCD(int max,int min){
          int GCD;
          //使得a>=b
            if(max < min){
             int c = max;
             max = min;
             min = c;
            }else if(max == min){
                return max;
            }
            while(true){
                //余数
                  int remain =  max%min;
                  if(remain==0){
                      GCD = min;
                        break;
                  }else{
                      max = min;
                      min = remain;
                  }
            }

            return GCD;
      }

      public static int getLCM(int a,int b){
            return (a*b)/getGCD(a,b);
      }
}
