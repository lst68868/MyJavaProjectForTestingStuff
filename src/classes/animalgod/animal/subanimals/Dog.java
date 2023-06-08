package src.classes.animalgod.animal.subanimals;
import src.classes.animalgod.animal.Animal;
public class Dog extends Animal {
    public boolean isCute;

    public Dog(boolean isCute, boolean throwsFeces, int weight, String name, int age, boolean isGod){
        super(throwsFeces, weight, name, age, isGod);
        this.isCute = isCute;
    }

    public static void dogMethod(){
        System.out.println("This is a method from dog!");
    }

}
