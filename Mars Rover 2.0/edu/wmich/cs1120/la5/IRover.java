package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.IArea;
import edu.wmich.cs1120.la5.IMapCreator;

/**
 * Interface for the Rover class.
 * @author Macallister Armstrong
 */
public interface IRover {
	
	ArrayList<IArea> getPath();
	// Set the path to be the given argument
	void setPath(ArrayList<IArea> path);
	// Analyze the path according to the type of the analyzer
	void analyzePath();
	// Get the result of the analysis according to the type of the analyzer
	String getAnalysis();
	void setAnalysis(String analysis);
	// Return the name of the analyzer
	String toString();
}
