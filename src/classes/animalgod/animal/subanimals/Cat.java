package src.classes.animalgod.animal.subanimals;
import src.classes.animalgod.animal.Animal;
 public class Cat extends Animal {

    public int numLives;
    public String meow;

    public Cat(int numLives, String meow, boolean throwsFeces, int weight, String name, int age){
        super(throwsFeces, weight, name, age);
        this.numLives = numLives;
        this.meow = meow;
    }

    public static void catMethod(){
        System.out.println("This is a method from Cat!");
    }

}
