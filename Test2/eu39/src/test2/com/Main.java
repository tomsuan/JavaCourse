package test2.com;




class TestClass{
    int x = 5;
    int getX(){ return x; }

    public static void main(String args[]) throws Exception{
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper(){
        int x = 0;
       // System.out.println(x);
        while( (x = getX()) != 0 ){
            System.out.println(x);
            for(int m = 10; m>=0; m--){
                x = m;
                System.out.println(x);
            }
        }

    }
}
















