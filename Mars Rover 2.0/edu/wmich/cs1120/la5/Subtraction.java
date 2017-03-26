package edu.wmich.cs1120.la5;

/**
 * Operates subtraction upon two values
 * 
 * @author Nick Huffman
 *
 */
public class Subtraction implements IOperation {
	
	/**
	 * Subtracts two IExpression objects together and returns an integer
	 * 
	 * @return calculated Integer
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() - right.getValue();
	}
}
