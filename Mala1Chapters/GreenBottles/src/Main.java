import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner reader = new Scanner(System.in);
		 
		 System.out.print("Enter number of bottles to start with: ");
		 
		int bott = Integer.parseInt(reader.nextLine());
		//int bottleAmt=9;
		String line="hanging on the wall";
		String chorus="and if one green bottle should accidently fall";
		for(int i=bott;i>0;i--){
			if(i==1){
				System.out.println("1 green bottle "+line);
				System.out.println("1 green bottle "+line);
				System.out.println(chorus);
			}
			else{
				System.out.println(i+" green bottles "+line);
				System.out.println(i+" green bottles "+line);
				System.out.println(chorus);
				System.out.println("there'll be "+(i-1)+" green bottles "+line);
			}
		}
		System.out.println("there'll be no green bottles "
				+ "hanging on the wall");
	}

}
