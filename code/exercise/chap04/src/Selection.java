package com.xhx.exercise.chap04;

public class Selection{
      
    public static void main(String[] args){
          
        int[] num = {1,45,32,66,3,43,23,23,34,71,45};

        //打印初始顺序
        for(int i:num){
              System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 0;i<num.length;i++){
            //找出最小数的的索引
            int min = num[i];
            int minIndex = i;
            for(int j = i+1;j<num.length;j++){
                  if(min>=num[j]){
                        min = num[j];
                        minIndex = j;
                  }
            }
    
            //替换第当前位
            int current = num[i];
            num[i] = min;
            num[minIndex] = current;
            
        }
        //排序后
        System.out.println("打印排序后顺序");
        for(int i:num){
              System.out.print(i+" ");
        }
        System.out.println();

        

    }
}
