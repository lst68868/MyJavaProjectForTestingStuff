package src.classes.animalgod;

import src.classes.animalgod.animal.Animal;

public class AnimalGod {
    String name;
    int age;
    boolean isGod;

    public AnimalGod(String name, int age, boolean isGod){
        this.name = name;
        this.age = age;
        this.isGod = isGod;
    }

    public static Animal createAnimal(boolean throwsFeces, int weight, String name, int age, boolean isGod){
        Animal NewAnimal = new Animal (throwsFeces, weight, name, age, isGod);
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
