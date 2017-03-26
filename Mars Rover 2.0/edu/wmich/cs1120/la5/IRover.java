package edu.wmich.cs1120.la5;

import java.util.ArrayList;

//import edu.wmich.cs1120.la5.IArea;

/**
 * Interface for the Rover class.
 * @author Macallister Armstrong
 */
public interface IRover {
	
	public ArrayList<IArea> getPath();
	public void setPath(ArrayList<IArea> path);
	public void analyzePath();
	public String getAnalysis();
	public void setAnalysis(String analysis);
	public String toString();

}
