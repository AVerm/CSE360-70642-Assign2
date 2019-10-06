/*
 * Author: Alex Vermillion
 * Class ID: CSE 360 # 70642
 * Assignment Number: #2
 * Description: Contains a class that can be used to perform
 *              arithmetic operations on integers
 */

package cse360assign2;

/**
 * Represents a series of operations to be performed.
 * <p>
 *
 * @param  total  the current total value of operations that
 *                have been performed
 * @see    int
 */
public class AddingMachine {

	private int total;
	
	/**
	 * Creates an object that can be used to perform a series of operations.
	 * <p>
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current total after all the operations have been performed.
	 * <p>
	 *
	 * @return  an integer that is the current total value
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds a value to the current total.
	 * <p>
	 * This method adds a value to the current total value and updates the
	 * history
	 *
	 * @param  value  the number to be added to the total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts a value to the current total.
	 * <p>
	 * This method subtracts a value from the current total value and
	 * updates the history
	 *
	 * @param  value  the number to be subtracted from the total
	 */
	public void subtract (int value) {
		
	}
		
	/**
	 * Returns the string representation of the operations have been performed.
	 * <p>
	 *
	 * @return  a string representation of the operations that have been performed
	 */
	public String toString () {
		return "";
	}

	/**
	 * Resets the adding machine.
	 * <p>
	 * Resets the total value and the history
	 *
	 */
	public void clear() {
	
	}
}
