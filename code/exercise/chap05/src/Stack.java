package com.xhx.exercise.chap05;

public class Stack{
      
    private int[] array;
    private int index;

    public Stack(){
          this.index = 0;
          this.array = new int[300];
    }

    public void push(int i){
          this.array[index++] = i;
    }

    public int pop(){
          return array[--index];
    }
}
