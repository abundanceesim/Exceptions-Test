package assignment2;

/**
 * Project: Assignment2
 * Filename: PlanC.java
 * Description: This class demonstrates the rethrowing of an exception in java using two method calls. The exception will be caught and rethrown and the method call stack
 * that lead to the exception would be displayed along with the error message.
 * @author Abundance Esim
 *
 */
public class PlanC {
	

	/**
	 * covidEnding() throws an exception.
	 * Keyword "throws" is used as this method is outside of the main method.
	 * @throws Exception this exception would be rethrown subsequently when this method is called by the covidStarting() method.
	 */
	public static void covidEnding() throws Exception {
		throw new Exception();
	}
	
	/**
	 * This method will call the covidEnding() method which would lead to the exception being rethrown.
	 * Keyword "throws" is used as this method is outside of the main method.
	 * @throws Exception the exception to be rethrown
	 */
	public static void covidStarting() throws Exception {
		/**
		 * try block calls covidEnding() that throws an exception.
		 */
		try {
			covidEnding();
		}
		/**
		 * The exception from covidEnding is caught and rethrown in this catch block.
		 */
		catch(Exception e) {
			throw e;
		}
	}
	
	/**
	 * Method main calls the covidStarting() method in order to demonstrate the successful rethrowing of an exception.
	 * covidStarting() will in turn call covidEnding() which would rethrow the exception.
	 * The system.err prints out the error message and the printStackTrace method will display the series of method calls that led to the exception in the main thread.
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * try catch statement. Try block calls covidStarting method which calls covidEnding() which will rethrow the exception.
		 */
		try {
			covidStarting();
		} 
		/**
		 * The exception is caught and the exception message is printed out and also the chain of methods leading to the exception using printStackTrace.
		 */
		catch (Exception e) {
			System.err.println("Exception caught in main thread.");
			e.printStackTrace();
		}
	}
}
