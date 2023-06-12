package src.classes.animalgod.animal;
import src.classes.animalgod.AnimalGod;

 public class Animal extends AnimalGod {
    //define
    public boolean throwsFeces;
    public int weight;
    public static int counter;

    //constructor(takes in values we've created)
    public Animal(boolean throwsFeces, int weight, String name, int age){
        super(name, age);
        this.throwsFeces = throwsFeces;
        this.weight = weight;
        increaseCount();
    }
    //methods

    public static void animalMethod(){
        System.out.println("This is a method from animal!");
    }

    public static void increaseCount(){
        counter += 1;
    }



    public static void howManyInstances(){
      System.out.println(counter);
    };
}


/*
Make three classes under animal:

A base class animal
And subclasses that inherit from animal

Play around with what you can and can’t do w inheritance

Next create a class animal god (lol) that is the base class for animal.

Repeat, checkout behaviors of what you can and can’t do reserve questions for next time we see each other or through text
*/