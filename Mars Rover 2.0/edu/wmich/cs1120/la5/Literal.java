package edu.wmich.cs1120.la5;

/**
 * Stores a single Integer literal
 * 
 * @author Nick Huffman
 *
 */
public class Literal implements IExpression {
	
	private Integer value;
	
	/**
	 * Constructor to store an integer value
	 * 
	 * @param value
	 */
	Literal(Integer value) {
		this.value = value;
	}
	
	/**
	 * Getter Integer value
	 * 
	 * @return value
	 */
	@Override
	public Integer getValue() {
		return value;
	}
}
