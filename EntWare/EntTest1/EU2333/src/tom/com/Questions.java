package tom.com;

/**
 * Created by tmurphy on 10/01/2017.
 */
public class Questions {


    static void Q23(){
        System.out.println(new Cow().age);


    }
    static void Q24(){
        String str1 = "one";
        String str2 = "two";

        System.out.println(str1.equals(str1=str2));


    }
    static void Q27(){

        double dnum = -0.5;
        System.out.println(Math.round(dnum));
        String str = "--0.50";
        System.out.println(str);

        int choice = (int)Math.round(
                Double.parseDouble(

                        str.substring(
                                1, str.length()-1)));





    }
    static void Q30(){
        int[] numArray= {22,33};
        int index = 3;
        try{
            System.out.println(numArray[index=0]);
            numArray[index=44]++;

        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
        System.out.println("index = "+ index);


    }
    static void Q31(){

        boolean b1 = false; boolean b2 = false;

        System.out.println("b1 is "+b1);

        System.out.println("b2 is "+b2);

        if(b2 != (b1 = !b2)){
            System.out.println("print true");
        }else{
            System.out.println("print false");
        }
    }
    private static int loop =15;
    static final int INTERVAL = 10;
    boolean flag;
    static{
        System.out.println("Static");
    }
    static {
        loop = 1;
    }
    static {loop += INTERVAL;}

    {flag = true; loop = 0;}
    static void Q32(){




            int loop = 15 ;
            final int INTERVAL = 10 ;
            boolean flag ;
            //line 1
        }
        static void Q33(){

        StringWrapper sw = new StringWrapper("How are you?");

        StringBuilder sb = new StringBuilder("How are you?");

            System.out.println("Hello, "+sw);
            System.out.println("Hello, "+sb);



        }
    }

