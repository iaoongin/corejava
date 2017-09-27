package com.xhx.advance.ch06;

public class RaceTest extends Thread{
      
    private static boolean isRunning = true;

    public RaceTest(String name){
          setName(name);
    }

    public void run(){
          for(int i =1;isRunning&&i<=20;i++){
                
                try{
                    if(i==10){
                        System.out.println("Sleeping....");
                     sleep(1000);
                    }
                }catch(InterruptedException e){
                      e.printStackTrace();
                }
                System.out.println(getName()+":"+i);
          }
          isRunning = false;

    }


    public static void main(String[] args){
          
        RaceTest tor = new RaceTest("tortoise");

        RaceTest rub = new RaceTest("rubbite");

        tor.start();
        rub.start();


    }
}
