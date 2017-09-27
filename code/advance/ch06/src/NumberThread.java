package com.xhx.advance.ch06;

public class NumberThread extends Thread{

    public void run(){

          for(int i = 1;i <= 10;i++){
                System.out.println(i);
          }
    }

      
    public static void main(String[] args) throws Exception{
          
        System.out.println("Begin Main...");



        Thread t = new NumberThread();
        t.start();

        Thread.sleep(300);
        System.out.println("End Main...");
    }

    
}
