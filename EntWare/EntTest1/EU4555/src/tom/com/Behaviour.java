package tom.com;

/**
 * Created by tmurphy on 12/01/2017.
 */
public interface Behaviour {

    void eat();
    void drink();
    default void sleep(){
        System.out.println("Rover Sleeeping");
    }
}
interface Behaviour2 extends Behaviour{

    void eat();
    default void sleep(){
        System.out.println("b2 sleeping");
    }
}

class Dog implements Behaviour,Behaviour2{

        @Override
        public void sleep(){
            System.out.println("Dog sleeping");
        }
    @Override
    public void eat() {
        System.out.println("Rex eating");
    }

    @Override
    public void drink() {

    }
}