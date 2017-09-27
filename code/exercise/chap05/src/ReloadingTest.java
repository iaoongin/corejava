package com.xhx.exercise.chap05;

public class ReloadingTest{
      
//1,参数个数

    //可以不同返回值，不同访问类型
    void talk(int i){}
    public String talk(){ return "";}

//2,参数类型
    void talk(String s){}
    public void talk(int i,int j){}
//    public void talk(int j,int i){}

//3,参数顺序
    public void talk(int i,String s){}

    public void talk(String s,int i){}

}
