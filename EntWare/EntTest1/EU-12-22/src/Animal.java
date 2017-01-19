/**
 * Created by tmurphy on 10/01/2017.
 */

public class Animal {

    void eat(){
        System.out.println("animal eat");
    }
    Animal returnAnimal(Animal myAnimal){
        return new Animal();
    }
}
class Cow extends Animal{

    void eat(){
        System.out.println("Cow eat");
    }
    Animal returnAnimal(Cow myAnimal){

        return new Cow();
    }
    void drink(){

        System.out.println("Cow drink available only in the Cow class");
    }
}
class Sheep extends Animal{

}