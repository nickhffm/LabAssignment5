package edu.wmich.cs1120.la5;

/**
 * Stores the binary expression to be solved in IOperation
 * 
 * @author Nick Huffman
 *
 */
public class BinaryExpression implements IExpression {
	
	private IOperation op;
	private Integer left;
	private Integer right;
	
	/**
	 * Constructor to store binary expression
	 * 
	 * @param left
	 * @param right
	 * @param op
	 */
	BinaryExpression(Integer left, Integer right, IOperation op) {
		this.left = left;
		this.right = right;
		this.op = op;
	}
	
	/**
	 * Calculates the binary expression and returns an integer object
	 * 
	 * @return Integer
	 */
	public Integer getValue() {
		return op.perform(new Literal(this.left), new Literal(this.right));
	}
}
