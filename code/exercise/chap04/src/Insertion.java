package com.xhx.exercise.chap04;

public class Insertion{
      
    public static void main(String[] args){
          
        System.out.println("***"+args+" length="+args.length);

        for(String s:args){





            
              System.out.println(s);
        }

        int[] num = {43,432,23,54,33,48,33,554,652,3324,543,89,75,987};

        int[] ordered = new int[num.length];

        //选取num中的数
        for(int i = 0;i<num.length;i++){
              
            //第一个直接插入
            if(i==0){
                  ordered[i]=num[i];
            }else{//第二个开始

            //循环和ordered中i个数字比较
                for(int j = 0;j<i;j++){
		//小于第一个数
		             if(num[i]<ordered[0]){
		    	    //移动。。。
                           for(int k = i;k>0;k--){
                                 ordered[k] = ordered[k-1];
                           }
                           ordered[0] = num[i];
			             break;
                     }
	   //大于最后一个数
	    	        if(num[i]>ordered[i-1]){
                     //直接放到之后
                            ordered[i]=num[i];
                         break;
                    }
		//在之间
    		       if(num[i]>=ordered[j]&&num[i]<=ordered[j+1]){//
                              
                    //添加时先移动...
                    //ordered右移动,从第i个开始移动,移动j+1个

                        for(int k = i;k>j+1;k--){
                        
                            ordered[k] = ordered[k-1];
                        }

                        ordered[j+1] = num[i];

                        break;
                    }
                 }   
             }
        }
        for(int i:ordered){
              System.out.print(i+" ");
        }
        System.out.println();
    }
}
