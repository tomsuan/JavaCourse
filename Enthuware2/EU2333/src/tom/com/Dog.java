package tom.com;

/**
 * Created by tmurphy on 23/01/2017.
 */
public class Dog {

    void eat(){

        System.out.println("Dog eat");

    }

    void callEat(){

        this.eat();
        eat();
    }
}
