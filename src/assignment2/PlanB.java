package assignment2;

/**
 * import IOException exception.
 */
import java.io.IOException;


/**
 * Project: Assignment 2
 * Filename: PlanB.java
 * Description: This class demonstrates the use of the catch block. It makes use of two inner classes which are in the inheritance hierarchy of class Exception. 
 * Each try catch block throws and catches a specific exception and all exceptions caught are of type Exception.
 * @author Abundance Esim
 *
 */
public class PlanB {

	/**
	 * Class name: ExceptionFour
	 * Description: Static inner class ExceptionFour inherits from Exception superclass. Static inner classes can be accessed in other static members without instantiating 
	 * the outer class. This exception will be caught in main method using the catch block of the type Exception.
	 * @author Abundance Esim
	 *
	 */
	static class ExceptionFour extends Exception{

	}
	/**
	 * Class name: ExceptionFive
	 * Description: Static inner class ExceptionFive inherits from ExceptionFour. Static inner classes can be accessed in other static members without instantiating the outer 
	 * class. This exception will be caught in main method using the catch block of the type Exception. Since no constructor is provided, the class would be assigned a default constructor.
	 * @author Abundance Esim
	 *
	 */
	static class ExceptionFive extends ExceptionFour{
			
	}
	
	/**
	 * Method main uses four different try catch blocks in order to catch the exceptions: ExceptionFour, ExceptionFive, NullPointerException, IOException which 
	 * are of type Exception. Each of these catch blocks is of type Exception. Since no constructor is provided, the class would be assigned a default constructor.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * try block to throw ExceptionFour.
		 */
		try {
			throw new ExceptionFour();
		}
		/**
		 * catch ExceptionFour and display an exception message describing the exception.
		 */
		catch(Exception ExceptionFour) {
			System.err.println("ExceptionFour caught in main thread.");
		}
		
		/**
		 * try block to throw ExceptionFive
		 */
		try {
			throw new ExceptionFive();
		}
		/**
		 * catch ExceptionFive and display an exception message describing the exception.
		 */
		catch(Exception ExceptionFive) {
			System.err.println("ExceptionFive caught in main thread.");
		}
		
		/**
		 * try block to throw NullPointerException.
		 */
		try {
			throw new NullPointerException();
		}
		/**
		 * catch NullPointerException and display an exception message describing the exception.
		 */
		catch(Exception NullPointerException) {
			System.err.println("NullPointerException caught in main thread.");
			
		}
		
		/**
		 * try block to throw IOException.
		 */
		try {
			throw new IOException();
		}
		/**
		 * catch IOException and display an exception message describing the exception.
		 */
		catch(Exception IOException) {
			System.err.println("IOException caught in main thread.");
		}
		
		
	}

}
