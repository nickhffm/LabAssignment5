package edu.wmich.cs1120.la5;

import java.util.ArrayList;

import edu.wmich.cs1120.la5.IArea;
import edu.wmich.cs1120.la5.IMapCreator;

/**
 * Interface for the Rover class.
 * @author Macallister Armstrong
 */
public interface IRover {
	
	/**
	 * Returns MapCreator object.
	 * @return
	 */
	public IMapCreator getMapCreator();
	/**
	 * Sets MapCreator object.
	 * @param mc
	 */
	public void setMapCreator(IMapCreator mc);
	
	/**
	 * Returns ArrayList of path traveled by the Rover.
	 * @return
	 */
	public ArrayList<IArea> getPath();
	/**
	 * Sets ArrayList of Area objects path.
	 * @param startRow
	 * @param startCol
	 */
	public void setPath(int startRow, int startCol);
	/**
	 * Calculates energy consumed along path.
	 * @return totalEnergy
	 */
	
	public double calculateEnergy();
}
