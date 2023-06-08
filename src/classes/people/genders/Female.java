package src.classes.people.genders;

import src.classes.people.Person;

public class Female extends Person {
    //basically an access modifier determines where this class can be seen from the package structure in your project
    //by default we do NOT declare any access modifier for these PROPERTIES (variables in a class) the access modifier will default to, default
    public int age;
    public int weight;
    public String name;

    public Female(int age, int weight, String name, boolean isPoor, String hairColor, int penisSize){
        super(hairColor, isPoor, penisSize);
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    //METHODS: a function inside a class
    // composed of: access modifier, returnType and nameOfMethod, Paramters
    public void canTap(){
        if(this.weight > 100) {
            System.out.println("Nope");
        }else{
            System.out.println("good to go");
        }
    }
    public void hideMass(){
        this.weight -= 10;
    }

    public void print(){
         System.out.println("Age: "+ this.age + "\nWeight: "+ this.weight + "\nName: " + this.name);
    }
}
