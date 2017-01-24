package tom.com;

/**
 * Created by tmurphy on 23/01/2017.
 */
public class Questions {


    static void Q44() {


        int x = 5;

    public int getX() {
        return x;
    }


    TestClass tc = new TestClass();
                tc.looper();
                System.out.println(tc.x);


    public void looper() {
        int x = 0;
        while ((x = getX()) != 0) {
            for (int m = 10; m >= 0; m--) {
                x = m;
            }
        }

    }



}
    class TestClass {


        }
}

