package com.android;
/**
 *
Exam objective 1.4 import other packages to make 
 *them accessible in your code
 * @author noelf
 *
 */
/*
 * will import all classes from the
 * com.building.residental package
 * which are Bungalow and Semi detached
 */
import com.building.residental.*;
/*
 * this will import all the classes in the
 * com.building package but NOT the
 * subpackages, will only import the
 * SkyScraper class
 */
import com.building.*;
/*
 * this just imports the ExamQuestion
 * Class
 */
import com.exam.ExamQuestion;
import com.exam.ExamQuestion2;
import com.exam.Test;

/*
 * this will import ONLY ALL the STATICS in this
 * class, which are the method getMarks() and
 * the static int variable marks
 */
import static com.exam.ExamQuestion2.*;
/*
 * this will import the static method
 * result() ONLY from the Test class
 */
import static com.exam.Test.result;
public class Main {

	public static void main(String[] args) {
		/*
		 * we can create these two objects as
		 * we have imported all classes from
		 * com.building.residetal
		 */
		Bungalow smallHouse=new Bungalow();
		SemiDetached semiHouse=new SemiDetached();
	
		/*
		 * we can create this as we have imported
		 * all classes from com.building
		 */
		SkyScraper sears=new SkyScraper();
		/*
		 * we can created this as we have imported
		 * the class com.exam.ExamQuestion;
		 */
		ExamQuestion ex1=new ExamQuestion();
		/*
		 * have to use a fully qualified name if
		 * we have not imported all classes or 
		 * one class from a package
		 */
		com.exam.Test myTest=new com.exam.Test();
		/*
		 * here are accessing the static members
		 * marks and getMarks(), as we used a static
		 * import for all the static members of
		 * the ExamQuestion class
		 */
		System.out.println(ExamQuestion2.marks);
		ExamQuestion2.getMarks();
		/*
		 * here we are accessing the Static
		 * method result from the Test class.
		 * we have imported ONLY the static
		 * method result() from the test class.
		 * no other statics are available from
		 * this class
		 */
		Test.result();
		
		
		
	}

}
