package edu.wmich.cs1120.la5;

/**
 * Contains IExpression objects in order to calculate the binary expression
 * 
 * @author Nick Huffman
 *
 */
public class ExpressionFactory {

	
	/**
	 * This static method will create and return a proper object according to the arguments received
	 * 
	 * @param operator
	 * @param val1
	 * @param val2
	 * @return object
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		switch (operator) {
		case '+':
			return new BinaryExpression(val1, val2, new Addition());
		case '-':
			return new BinaryExpression(val1, val2, new Subtraction());
		default:
			throw new RuntimeException("Invalid operand, unable to proceed");
		}
	}
}
