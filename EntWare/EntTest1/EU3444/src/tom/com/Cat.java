package tom.com;

/**
 * Created by tmurphy on 11/01/2017.
 */
public class Cat {

    void eat() {
        System.out.println("Cat eat");
    }

}
class Siamese extends Cat{
    void eat(){
        System.out.println("Siamese eat");
    }
    void drink(){
        System.out.println("Siamese drink");
    }
    int returnInt(){
        return 0;
    }
}
