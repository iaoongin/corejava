package com.xhx.exercise.chap06;

import java.lang.reflect.*;

public class ReflectTest{
      
    public static void main(String[] args) throws Exception{
          
        Student s = (Student) test("com.xhx.exercise.chap06.Student");

        System.out.println(s);
    }

    public static Object test(String cn) throws Exception{
          Class c = Class.forName(cn);

          Object o = c.newInstance();

          Method[] methods = c.getDeclaredMethods();

          for(Method m:methods){
                    // find the setter()
                    if(m.getName().startsWith("set")){

                        System.out.println(m);
                        //get the para Types and evalue
                        for(Class para:m.getParameterTypes()){
                              if(para.getName().equals("java.lang.String")){
                                    m.invoke(o,"Allen");      
                              }
                              if(para.getName().equals("int")){
                                    m.invoke(o,19);
                              }
                        }
                    }
          }

          return o;
    }
}
