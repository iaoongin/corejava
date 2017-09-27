package com.xhx.exercise.chap06;

import java.util.*;

public class MyQueue{
      private List list;

      public MyQueue(){
            list = new ArrayList();
      }

      public void in(Object o){
            list.add(o);
      }

      public Object out(){
            if(list.size()>0){
                Object o = list.get(0);
                list.remove(0);
                return o;
            }else{
                  return null;
            }
      }
}
