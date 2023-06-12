package src.classes.animalgod;

import src.classes.animalgod.animal.Animal;

public class AnimalGod {
    public String name;
    public int age;
    public boolean isGod;

    public AnimalGod(String name, int age, boolean isGod){
        this.name = name;
        this.age = age;
        this.isGod = isGod;
    }

    //Overloaded constructor to handle inherited classes NOT getting god property (setting it to false)
    public AnimalGod(String name, int age){
        this.name = name;
        this.age = age;
        this.isGod = false;
    }

    public static Animal createAnimal(boolean throwsFeces, int weight, String name, int age, boolean isGod){
        Animal NewAnimal = new Animal (throwsFeces, weight, name, age);
        System.out.println("A new animal has been created. Here are its properties: " +
                "\nthrowsFeces: " + throwsFeces +
               "\nweight: " + weight +
               "\nname: " + name +
               "\nage: " + age +
               "\nisGod " + isGod
       );
       return NewAnimal;
    }

}
