/**
 * Created by tmurphy on 19/01/2017.
 */
public class MyException extends Throwable {

}
class MyException2 extends MyException {

}
class MyExcption3 extends MyException2{


}

class ExceptionTest{
    void myMethod() throws MyException {
        throw new MyException();
    }
}