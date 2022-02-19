package assignment2;

/**
 * Project: Assignment 2
 * Filename: Plan.java
 * Description: This class demonstrates that subclass exceptions can be caught in the catch block of a superclass type exception.It would do so using the inheritance 
 * hierarchy of these classes. It also demonstrates the use of inner classes.ExceptionOne inherits from Exception, ExceptionTwo inherits from ExceptionOne and 
 * ExceptionThree inherits from ExceptionTwo. 
 * @author Abundance Esim
 *
 */
public class PlanA {

	//ExceptionOne could be an IOException, ClassNotFoundException or a RuntimeException
	/**
	 * Class name: Exception One
	 * Description: Static inner class ExceptionOne inherits from Exception superclass. Static inner classes can be accessed in other static members without instantiating the 
	 * outer class. This class would be used in method main as the superclass exception type for the subclass exceptions ExceptionTwo and ExceptionThree. Since no constructor is provided, the class
	 * would be assigned a default constructor.
	 * @author Abundance Esim
	 *
	 */
	static class ExceptionOne extends Exception{
	
	}
	
	/**
	 * Class name: ExceptionTwo
	 * Description: Static inner class ExceptionTwo inherits from ExceptionOne. Static inner classes can be accessed in other static members without instantiating the outer class.
	 * This class would be used in method main to test that it would be caught in the catch block of the superclass exception ExceptionOne. Since no constructor is provided, the class
	 * would be assigned a default constructor.
	 * @author Abundance Esim
	 *
	 */
	static class ExceptionTwo extends ExceptionOne{
		
	}
	
	/**
	 * Class name: ExceptionThree
	 * Description: Static inner class ExceptionTwo inherits from ExceptionOne. Static inner classes can be accessed in other static members without instantiating the outer class.
	 * This class would be used in method main to test that it would be caught in the catch block of the superclass exception ExceptionOne. Since no constructor is provided, the class
	 * would be assigned a default constructor.
	 * @author Abundance Esim
	 *
	 */
	static class ExceptionThree extends ExceptionTwo{
		
	}
	
	/**
	 * Method main contains try catch blocks for subclass exceptions of the type ExceptionOne. These try catch blocks will show that the subclass exceptions will
	 * be caught in the catch block of the superclass of type ExceptionOne.
	 * @param args
	 */
	public static void main(String[] args){
		
		/**
		 * try block will throw ExceptionTwo.
		 */
		try{
			throw new ExceptionTwo();
		}
		/**
		 * catch block will catch the exception and display the exception message using system.err.println
		 */
		catch(ExceptionOne ExceptionTwo) {
			System.err.println("ExceptionTwo caught in main thread.");
		}

		/**
		 * try block will throw ExceptionThree.
		 */
		try{
			throw new ExceptionThree();
		}
		/**
		 * catch block will catch ExceptionThree and display the exception message using system.err.println
		 */
		catch(ExceptionOne ExceptionThree) {
			System.err.println("ExceptionThree caught in main thread.");
		}
	}

}
