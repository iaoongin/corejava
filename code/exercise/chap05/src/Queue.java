package com.xhx.exercise.chap05;

public class Queue{
    private int[] array;
    private int tailIndex;
    private int headIndex;

    public Queue(){
          this.tailIndex = 0;
          this.headIndex = 0;
          this.array = new int[300];
    }

    public void in(int i){
          if(tailIndex<array.length){
              array[tailIndex++] = i;
          }
    }

    public int out(){
         if(headIndex<=tailIndex){
              return array[headIndex++];
         }else{
               return 0; 
         }

    }
}
