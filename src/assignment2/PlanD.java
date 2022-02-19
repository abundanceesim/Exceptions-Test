package assignment2;

/**
 * IOException is imported.
 */
import java.io.IOException;


/**
 * Project: Assignment 2
 * Filename: PlanD.java
 * Description: This class demonstrates the importance of the order of catch statements in a program. It shows the compilation error gotten when a program tries to catch 
 * a superclass exception before a subclass exception. It does so using the superclass exception Exception and the subclass exception IOException. Both exceptions are 
 * thrown in the try block but the program catches Exception first, before it moves to the catch block for IOException. Compilation error occurs because when the superclass 
 * exception is caught, there is no need for the compiler to try to handle the subclass exception specifically as it is already handled by the superclass exception and so its
 * catch block becomes unreachable to the compiler. The order of the exceptions is gotten from the Throwable hierarchy.
 * @author Abundance Esim
 *
 */
public class PlanD {

	/**
	 * Method main contains the try statement which instantiates and throws two exceptions, the superclass exception(Exception), and the subclass exception(IOException).
	 * Because the generic exception has already been caught and handled, the more catch block for the more specific exception IOException can no longer be reached, resulting
	 *  in a compilation error.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * try catch blocks to catch the exceptions. Try block would throw Exception and IOException. 
		 */
		try {
			throw new Exception();
			throw new IOException();
		}
		/**
		 * Exception is caught, along with all other subclass exceptions under it
		 */
		catch (Exception ex) {
			System.err.println("Superclass exception Exception caught in main thread.");
		}
		/**
		 * catch block for IOException is unreachable since it is already being handled in the catch block for Exception, and a compilation error occurs.
		 */
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
