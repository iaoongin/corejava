package com.xhx.exercise.chap04;

public class ArrayMultiDTest{
      
    public static void main(String[] args){
          
        int[][][] array1 = new int[2][3][4];

        

        int[][][] array2 = {
            {
                {
                    1,2,3
                },
                {
                    4
                }
            }, 
            {
                  {
                    7,8
                  }
            }
        };

        printArray3D(array2);

        printArray3D(array1);
    }

    public static void printArray3D(int[][][] array){
          
        for(int i = 0;i<array.length;i++){
              for(int j = 0;j<array[i].length;j++){
                    for(int k = 0;k<array[i][j].length;k++){
                          
                        System.out.println("array["+i+"]["+j+"]["+k+"]="+array[i][j][k]);
                    }
              }
        }
    }
}
