package T1Q33;



class StringWrapper {
    private String theVal;
    public StringWrapper(String str){ this.theVal = str; }
}
public class Tester{
    public static void main(String[] args) { StringWrapper sw = new StringWrapper("How are you?");
    StringBuilder sb = new StringBuilder("How are you?");
    System.out.println("Hello, "+sw);
    System.out.println("Hello, "+sb);
    }
}
}
