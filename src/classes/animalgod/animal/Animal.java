package src.classes.animalgod.animal;
import src.classes.animalgod.AnimalGod;

public class Animal extends AnimalGod {
    //define
    public boolean throwsFeces;
    public int weight;

    //constructor(takes in values we've created)
    public Animal(boolean throwsFeces, int weight, String name, int age, boolean isGod){
        super(name, age, isGod);
        this.throwsFeces = throwsFeces;
        this.weight = weight;
    }
    //methods

    public static void animalMethod(){
        System.out.println("This is a method from animal!");
    }

}


/*
Make three classes under animal:

A base class animal
And subclasses that inherit from animal

Play around with what you can and can’t do w inheritance

Next create a class animal god (lol) that is the base class for animal.

Repeat, checkout behaviors of what you can and can’t do reserve questions for next time we see each other or through text
*/