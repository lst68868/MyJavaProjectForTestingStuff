package src;
import src.classes.animalgod.AnimalGod;
import src.classes.animalgod.animal.*;
import src.classes.animalgod.animal.subanimals.*;

public class Main {
    public static void main(String[] args){
        Animal.animalMethod();
        Dog.dogMethod();
        Cat.catMethod();

       Animal NewestAnimal = AnimalGod.createAnimal(false, 32, "Beth", 23, false);

       System.out.print(NewestAnimal);
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