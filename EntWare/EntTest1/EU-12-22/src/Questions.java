import com.gretb.Cat;
import com.gretb.Dog;

public class Questions {


    static void Q12() {


        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++) {
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);
    }

    static void Q13() {


        String str1 = new String("tom");
        String str2 = new String("tom");
        String str3 = "tom";
        System.out.println("Checking for equivalence");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("Check str2 and str3");
        System.out.println(str2 == str3);
        System.out.println("Check str3 and str4");
        //System.out.println(str3==str4);


        String hello = "Hello", lo = "lo";

        System.out.println((hello == hello) + " Of course it is.");    //line 1

        System.out.println((hello == hello) + " ");   //line 2
        System.out.println((hello == ("Hel" + "lo")) + " ");           //line 3
        System.out.println((hello == ("Hel" + lo)) + " ");              //line 4
        System.out.println(hello == ("Hel" + lo).intern());          //line 5

    }

    static void Q15() {

        String[] arr = new String[2];

        try {

            arr[0].length();
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    static void Q18() {
        System.out.println(Behaviour.finalInt);


    }
    static void Q19(){

        Dog spot = new Dog();
        Cat.catStat();
    }
    static void Q20(){
        String str1 = "Richard";
        System.out.println(str1.concat("nJosephson"));
        System.out.println(str1);
    }

    static void Q21(){

        Animal ariel = new Cow();
        ariel.eat();
    }
}









