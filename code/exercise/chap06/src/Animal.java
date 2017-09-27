package com.xhx.exercise.chap06;

public abstract class Animal{
      
    protected int legs;
    protected Animal(){}
    protected Animal(int legs){
          this.legs = legs;
    }

    public abstract void walk();
    public abstract void eat();

    public static void main(String[] args){
            Fish f = new Fish();
            Cat c = new Cat("Fluffy");
            Animal a = new Fish();
            Animal e = new Spider();
            Pet p = new Cat();
            f.play();
            c.play();
            e.eat();
            e.walk();
            a.walk();
    }
}

interface Pet{
      public String getName();
      public void setName(String name);
      public void play();
}

class Cat extends Animal implements Pet{
      private String name;
      public Cat(String name){
            this.name = name;
      }
      public Cat(){}

      public String getName(){
            return this.name;
      }
      
      public void setName(String name){
            this.name = name;
      }

      public void play(){
            System.out.println("play with Cat named "+this.name);
      }
      public void eat(){
            System.out.println("Cat named "+this.name+" is eating...");
      }

      public void walk(){
            System.out.println("Cat named "+this.name+" is walking...");
      }

}

class Fish extends Animal implements Pet{
      private String name;
      public Fish(){}

      public String getName(){
            return this.name;
      }

      public void setName(String name){
            this.name = name;
      }

      public void play(){
          System.out.println("play with Fish named "+this.name);
      }


      public void walk(){
            System.out.println("Fish named "+this.name+" is walking...");
      }

      public void eat(){
            System.out.println("Fish named "+name+" is eating...");
      }
}

class Spider extends Animal implements Pet{
    private String name;  
    public Spider(){}

    public String getName(){
          return this.name;
    }

    public void setName(String name){
          this.name = name;
    }

    public void play(){
          System.out.println("play with Spider named "+this.name);
    }

    public void eat(){
          System.out.println("Spider named "+this.name+" is eating...");
    }

    public void walk(){
          System.out.println("Spider named "+this.name+" is walking...");
    }
}
