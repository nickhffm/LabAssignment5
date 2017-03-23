package edu.wmich.cs1120.la5;

import java.io.FileNotFoundException;

public class MapCreatorFromDat implements IMapCreator {

	TerrainScanner ts;
	IArea[][] terrain;
	
	public void scanTerrain(String fileName, int threshold) throws FileNotFoundException {
		
	}
	
	/**
	 * Returns TerrainScanner object.
	 * @return
	 */
	public TerrainScanner getScanner() {return ts;}
	
	/**
	 * Sets TerrainScanner object.
	 * @param scanner
	 */
	public void setScanner(TerrainScanner scanner) {ts = scanner;}
	
	public void setTerrain(IArea[][] terrain) {this.terrain = terrain;}
	
	public IArea[][] getTerrain() {return terrain;}
}
