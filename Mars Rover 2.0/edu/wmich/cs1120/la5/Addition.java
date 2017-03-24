package edu.wmich.cs1120.la5;

/**
 * Operates addition upon two values
 * 
 * @author Nick Huffman
 *
 */
public class Addition implements IOperation {

	/**
	 * Adds two IExpression objects together and returns an integer
	 * 
	 * @return calculated Integer
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		return left.getValue() + right.getValue();
	}
}
