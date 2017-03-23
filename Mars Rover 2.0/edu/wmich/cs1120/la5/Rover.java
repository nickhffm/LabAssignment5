package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.IArea;
import edu.wmich.cs1120.la5.IRover;
import edu.wmich.cs1120.la5.IMapCreator;

/**
 * Sets MapCreator object and ArrayList<Area> object.
 * Calculates consumed energy along path.
 * @author Macallister Armstrong
 */
public class Rover implements IRover {

	private IMapCreator mc;
	private ArrayList<IArea> path;
	
	/**
	 * Empty constructor for the Rover class.
	 */
	public Rover() {}
	
	/**
	 * Sets MapCreator object in Rover class.
	 * @param mc
	 */
	public void setMapCreator(IMapCreator mc) 
		{this.mc = mc;}
	/**
	 * Returns MapCreator object for Rover class.
	 * @return mc
	 */
	public IMapCreator getMapCreator()        
		{return mc;}
	
	/**
	 * Sets the path of type ArrayList<Area> traveled by the Rover.
	 * @param startRow
	 * @param startCol
	 */
	public void setPath(int startRow, int startCol) 
		{path = mc.getScanner().getPath(startRow, startCol);}
	/**
	 * Returns ArrayList of path traveled by the Rover.
	 * @return path
	 */
	public ArrayList<IArea> getPath()         
		{return path;}
	
	public void analyzePath() {
		
	}
	
	public String getAnalysis() {
		String string = "";
		return string;
	}
	
	public void setAnalysis() {
		
	}
	
	public String toString() {
		String string = "";
		return string;
	}
	
	/**
	 * Calculates energy consumed by traveling along path.
	 * @return totalEnergy
	 */
	public double calculateEnergy() {
		double totalEnergy = 0;
		for (int i = 0; i < path.size(); i++) {
			totalEnergy += path.get(i).calcConsumedEnergy();
		}
		return totalEnergy;
	}
}
