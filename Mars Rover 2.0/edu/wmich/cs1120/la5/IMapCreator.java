package edu.wmich.cs1120.la5;

import java.io.FileNotFoundException;
import edu.wmich.cs1120.la5.TerrainScanner;

/**
 * Interface for the MapCreator class.
 * @author Macallister Armstrong
 */
public interface IMapCreator {
	
	/**
	 * Creates an matrix Area objects.
	 * @param fileName
	 * @param threshold
	 * @throws FileNotFoundException
	 */
	public void scanTerrain(String fileName, int threshold) throws FileNotFoundException;
	
	/**
	 * Returns TerrainScanner object.
	 * @return
	 */
	public TerrainScanner getScanner();
	/**
	 * Sets TerrainScanner object.
	 * @param scanner
	 */
	public void setScanner(TerrainScanner scanner);
	
	public void setTerrain(IArea[][] terrain);
	
	public IArea[][] getTerrain();
}
