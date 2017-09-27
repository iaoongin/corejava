package com.xhx.basic.ch04;

public class ArrayExecTest{
      public static void avg(int[] arr){
            int avg = 0;
            for(int i:arr){
                  avg+=i/arr.length;
            }
            System.out.println("平均值为："+avg);
      }

      public static void max(int[] arr){
            
          int max = arr[0];
          for(int i:arr){
                if(max<i){
                      max = i;
                }
          }

          System.out.println("最大值为："+max);
      }

      public static void bubble(int[] arr){
            
          System.out.print("冒泡排序：");
          for(int i = 0;i<arr.length;i++){
                
              for(int j = 0;j<arr.length-i-1;j++){
                    
                  if(arr[j]>arr[j+1]){
                        int c = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = c;
                  }
              }
          }

          for(int i:arr){
                System.out.print(i+" ");
          }
          System.out.println();
      }

      public static void main(String[] args){
            
          int[] arr = {200,170,80,90,10};
          avg(arr);
          max(arr);
          bubble(arr);
      }
}
