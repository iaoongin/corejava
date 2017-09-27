package com.xhx.basic.ch04;

public class YangHuiTriangle{
      
    public static void main(String[] args){
          
        int arr[][] = new int[10][];

        for(int i = 0;i<arr.length;i++){
              
            //使用第二维时先创建
            arr[i] = new int[i+1];
            for(int j = 0;j<i+1;j++){
                  

                //第一个和最后一个为1
                if(j==0||j==i){
                      arr[i][j]=1;
                }else{
                    
                      //上一行第j个与第j-1个之和
//                      System.out.println(arr[i-1][j-1]+"+"+arr[i-1][j]);
                      arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }

        //获取最大值
        int max = arr[arr.length-1][0];
        for(int i = 0;i<arr[arr.length-1][i];i++){
              if(max<arr[arr.length-1][i]){
                    max = arr[arr.length-1][i];
              }
        }

        //最大值的位数
        int bit1 = getBit(max);

        int bit1_space = 0;
//        System.out.println(max+"的位数为:"+bit1);

        for(int i = 0;i<arr.length;i++){
            
            //每行前的空格数,与最大数的位数相关
           if(i!=arr.length-1){
               bit1_space =(((i+1)*2-1)/2-i)*bit1;
              printSpace(bit1_space);
                 
           }

            for(int j = 0;j<arr[i].length;j++){
               //每个数字前的空格数
                int bit2 = getBit(arr[i][j]);
                //打印空格


                printSpace(bit1-bit2);

                //打印数字
               System.out.print(arr[i][j]);

               printSpace(bit1_space);
            }
        System.out.println();
        }
    }

    //获取一个数字的位数
    public static int getBit(int i){
        String str = ""+i;
        char c[] = str.toCharArray();
        return c.length;
    }

    //打印n个空格
    public static void printSpace(int n){
          for(int i = 0;i<n;i++){
                System.out.print(" ");
          }
    }
}
