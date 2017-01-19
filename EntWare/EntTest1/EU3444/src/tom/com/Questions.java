package tom.com;
import static com.gretb.Statics.*;

/**
 * Created by tmurphy on 11/01/2017.
 */
public class Questions implements Behaviour {

    static void Q35(){

        System.out.println(beInt);
    }
    /*
    static void Q38(){

        Animal aerial = new Animal();
        Dog rover = new Dog();
        //rover=aerial;
        aerial = (Animal)rover;
        aerial = rover;

        System.out.printf("Animal is "+ toString(aerial));
        System.out.println("Dog is "+ toString(rover));
        //Super s1 = new Super();
        //Sub s2 = new Sub();

    }

    private static void toString(Animal aerial) {

        return ;
    }
    */
    static void Q39(){

        System.out.println(statInt);

    }
    static void Q40(){

        Cat kitty = new Cat();
        Siamese sam = new Siamese();

        kitty = sam;
        System.out.println(kitty.toString());
        System.out.println(sam.toString());

        System.out.println(kitty.getClass());
        System.out.println(sam.getClass());

        kitty.eat();
        sam.drink();
    }
    static void Q42(){

        Object t = new Integer(107);
        //Integer number = new Integer(23);
      // number.intValue();
        //System.out.println(t.toString());
        //Animal aristotle = new Animal();
        //System.out.println(aristotle);
        int k =((Integer) t).intValue() /9;
        System.out.println(k);
    }
    static void Q44(){


        boolean[] args = ;
        System.out.println(args[1]);
    } }

