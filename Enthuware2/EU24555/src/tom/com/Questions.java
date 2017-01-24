package tom.com;

/**
 * Created by tmurphy on 23/01/2017.
 */
public class Questions {



    static void Q55(){





        class A{
            int i;
            public A(int x) {
                this.i = x;
            }
        }
        class B extends A{
            int j;
            public B(int x, int y) {
                super(x);  this.j = y;
            }

            B(int z ) { this(z, z); }
        }


        }


    }





