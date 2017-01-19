/**
 * Created by tmurphy on 19/01/2017.
 */
public class Questions {

    static void Q1() {

    }

    static void Q2() {
        int j = 0;
        while (j <= 5) {
            for (j = 1; j <= 5; ) {
                System.out.print(j + " ");
                j++;
            }
            j++;
        }

    }

    static void Q3() {

        //Consider the following class:

        class Test {
            public int id;
        }
        // Which of the following is the correct way to make the variable 'id' read only for any other class?

        //Make 'id' private and provide a public method getId() which will return its value.
    }

    static void Q4() throws MyException {
        ExceptionTest myTest = new ExceptionTest();
        //myTest.myMethod();
        try {
            myTest.myMethod();
        } catch (MyException e) {
            System.out.println("e");
        }

    }
    static void Q5(){

        Behaviour behavePerson = new Person();

        System.out.println(behavePerson.location);
    }
    static void Q8(){

 int i = 0 ;
 int[] iA = {10, 20} ;
 iA[i] = i = 30 ;
 System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
    }

    static void Q9(){
    OverloadingTest ot = new OverloadingTest();
    ot.method1(2);
    ot.method1(2.0);
    ot.method1("Hello");

    }
}



