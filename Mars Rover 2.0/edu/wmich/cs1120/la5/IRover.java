package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * Interface for the Rover class.
 * @author Macallister Armstrong
 */
public interface IRover {
	
	/**
	 * Returns path.
	 * @return path
	 */
	public ArrayList<IArea> getPath();
	/**
	 * Sets path.
	 * @param path
	 */
	public void setPath(ArrayList<IArea> path);
	
	/**
	 * Analyzes path.
	 */
	public void analyzePath();
	
	/**
	 * Returns analysis.
	 * @return analysis
	 */
	public String getAnalysis();
	/**
	 * Sets analysis.
	 * @param analysis
	 */
	public void setAnalysis(String analysis);
	
	/**
	 * Returns label for analyzer.
	 * @return label
	 */
	public String toString();

}
