package tom.com;

import com.sun.javafx.scene.control.behavior.BehaviorBase;

/**
 * Created by tmurphy on 12/01/2017.
 */
public class Questions {


    static void Q47() {


        int i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;
        bool = (bool2 & method1(i++)); //1
        System.out.println("Line 1 is " + bool + " and number is " + i);
        bool = (bool2 && method1(i++)); //2    
        System.out.println("Line 2 is " + bool + " and number is " + i);

        bool = (bool1 | method1(i++)); //3   
        System.out.println("Line 3 is " + bool + " and number is " + i);
        bool = (bool1 || method1(i++)); //4
        System.out.println("Line 4 is " + bool + " and number is " + i);
        System.out.println(i);
    }

    public static boolean method1(int i) {
        return i > 0 ? true : false;

    }

    static void Q49() {


        String s = "MINIMUM";
        System.out.println(s.substring(4, 7)); //1       
        System.out.println(s.substring(5)); //2       
        System.out.println(s.substring(s.indexOf('I', 3))); //3       
        System.out.println(s.substring(s.indexOf('I', 4))); //4    


    }

    static void Q51() {

        Dog rover = new Dog();
        rover.sleep();

    }

    static void Q53() {
        Behaviour behaveDog = new Dog();
        behaveDog.sleep();
        behaveDog.drink();


        Behaviour obey = new Behaviour() {
            @Override
            public void eat() {
                System.out.println("Somebody's dog is eating");
            }

            @Override
            public void drink() {
                System.out.println("An another dog is drinking");

            }
        };
    }

    static void Q3() {


         public class Sample implements IInt{
             public static void main(String[] args){       Sample s = new Sample();  //1       int j = s.thevalue;       //2       int k = IInt.thevalue;    //3       int l = thevalue;         //4    } } public interface IInt{       int thevalue = 0; }   What will happen when the above code is compiled and run?
        }




