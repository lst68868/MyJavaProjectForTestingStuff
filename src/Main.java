package src;
import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;
import src.classes.animalgod.AnimalGod;
import src.classes.animalgod.animal.*;
import src.classes.animalgod.animal.subanimals.*;

public class Main {
    public static void main(String[] args){
        Animal tree = new Animal(false, 1000, "Spruce", 15_000);
        Animal bush = new Animal(true, 10, "GeorgeWBush", 10);
        Animal hedge = new Animal(false, 1, "fund", 6);
        Animal.howManyInstances();

        tree.name += " sprucy";
        System.out.println(tree.name);

        Cat mrMeow = new Cat(4,"Yes",false,100,"MR. MEOWWWW", 4);
        mrMeow.meow = "Meow Princess";
        System.out.println(mrMeow.name);


        //This prints memory location. Why not object and all of its properties?
    }
}

//when declaring variable we must include TYPE and NAME and what its equal to
//        Female shelly = new Female(24, 140, "shelly", true, "brown", 0 );
//        System.out.println(shelly.isPoor);
//        System.out.println(shelly.hairColor);
//        System.out.println(shelly.penisSize);

//THIS is polymophism, a subclass can be defined by ANY of its base classes
//        Person Girlie = new Female(19, 90, "girlie", false, "Blue",  0);

//        Person genericPerson = new Person("beige", true, 4);
//        Female shellyPerson = (Female) genericPerson;


//        System.out.println();
// There are RuntTime Errors and there are Compilation Errors:
// Compilation errors as errors that the IDE you're catches before you even run the program
// Runtime errors are caught AT THE MOMENT OF EXECUTION
//
//        ((Female) genericPerson).age = 42;

//        System.out.println(((Female) genericPerson).age);