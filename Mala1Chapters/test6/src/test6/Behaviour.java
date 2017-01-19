package test6;

public interface Behaviour {
	
	int finalInt=34;
	
	default void angry(){
		System.out.println("i am angry");
	}
	
	/*
	 * have to give a body to a static method in a interface
	 * 
	 */
	static void happy() {
		System.out.println("we are happy");
	}
	
	/*
	 * can be anything other than public,
	 * implicitly public
	 */
/*	protected void sad(){
		
	}*/
	
	void excited();

}

interface interface1 {
	default void test(){
		System.out.println("interface1 test");
	}
}

interface interface2 {
	default void test(){
		System.out.println("interface2 test");
	}
}

interface FinalInterface extends interface2,interface1{

	@Override
	default void test() {
		// TODO Auto-generated method stub
		System.out.println("finalINterface test");
		interface2.super.test();
		interface1.super.test();
		
	}
	
	
	
}
