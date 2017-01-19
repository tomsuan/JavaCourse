/**
 * Created by tmurphy on 19/01/2017.
 */
public class OverloadingTest {

    void method1(int num){
        System.out.println("method1 called");
    }

    void method1(double dnum){

        System.out.println("method2 called");
    }

    void method1(String str){

        System.out.println("method3 called");
    }

}
