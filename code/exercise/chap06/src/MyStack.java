package com.xhx.exercise.chap06;

import java.util.*;

public class MyStack{
      
    private int index;
    private ArrayList list;

    public MyStack(){
          list = new ArrayList();
    }

    public void push(Object o){
          index++;
          list.add(o);
    }

    public Object pop(){
          if(list.size()>0&&index>0&&index<=list.size()){
              int i = --index;
              Object o = list.get(i);
             list.remove(i);
             return o;
          }else{
                return null;
          }
    }
}
