package com.xhx.advance.ch06;

public class NumberRunnable extends Thread implements Runnable{
      
    public NumberRunnable(String name){
          super(name);
    }


    public void run(){
          
        for(int i = 1;i<20;i++){
              System.out.println(getName()+": "+i);
        }
    }

    public static void main(String[] args){
          
        Thread t = new Thread(new NumberRunnable("xxx"),"yyy");

        t.start();
    }
}
