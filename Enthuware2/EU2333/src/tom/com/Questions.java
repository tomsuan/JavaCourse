package tom.com;


import com.google.Test2;

import java.util.ArrayList;
import java.util.Collection;

public class Questions {

    static void Q24() {

        com.gretb.Test myTest = new com.gretb.Test();

        Questions myQuestion2 = new Questions();

        System.out.println("Test");

        com.google.Test2 myTest3 = new com.google.Test2();

        Test2 myTest4 = new Test2();

    }

    static void Q25() {

    }

    static void Q29() {
        Object o = null;

        Collection c = new ArrayList<Integer>();
        int[][] ia = {{23,45,67},{12,34,56}};

        System.out.println(ia[1]);
/*
        //System.out.println(c);
        for(Object i:c){
            System.out.println(i);


            for(final Object o1 : c){}

            for(int[] ignored : ia){}

            for (int[] ignored :ia){}
            System.out.println(i);
            System.out.println(ia);
*/

    for (int j :ia[1]){
        System.out.println(j);
    }
        }

    static void Q30(){

        Animal irvine = new Animal();
        irvine.Animal(10);
        new Animal().Animal(5);
    }
    static void Q31(){
        String str = "01234567";
        System.out.println(str.substring(4,7));
        System.out.println(str.substring(4));
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(4,6));
        try{
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}