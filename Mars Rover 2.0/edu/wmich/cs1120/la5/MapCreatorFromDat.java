package edu.wmich.cs1120.la5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Generates the map for the GUI
 * 
 * @author Nick Huffman
 *
 */
public class MapCreatorFromDat implements IMapCreator {

	TerrainScanner ts;
	IArea[][] terrain;
	
	/**
	 * Read from the file, set up the IArea[10][10] and set the terrain for the object of TerrainScanner
	 * 
	 * @param fileName
	 * @param threshold
	 */
	public void scanTerrain(String fileName, int threshold) throws FileNotFoundException {
		
		RandomAccessFile dataFile = new RandomAccessFile(fileName, "r");
		int pos;
		
		for (int r=0; r<terrain.length; r++) {
			for (int c=0; c<terrain[0].length; c++) {
				
				try {
					terrain[r][c].setBasicEnergyCost(dataFile.readDouble());
					terrain[r][c].setElevation(dataFile.readDouble());
					terrain[r][c].setRadiation(dataFile.readDouble());
					char operator = dataFile.readChar();
					int val1 = dataFile.readInt();
					int val2 = dataFile.readInt();
					IExpression ef = ExpressionFactory.getExpression(operator, val1, val2);
					dataFile.seek(ef.getValue());
				}
				catch (IOException e) {
					throw new RuntimeException("End of file, incomplete array");
				}
			}
		}
		
	}
	
	/**
	 * Returns TerrainScanner object.
	 * @return ts
	 */
	public TerrainScanner getScanner() {
		return ts;
	}
	
	/**
	 * Sets TerrainScanner object.
	 * @param scanner
	 */
	public void setScanner(TerrainScanner scanner) {
		ts = scanner;
	}
	
	/**
	 * Sets IArea array of objects
	 * @param terrain
	 */
	public void setTerrain(IArea[][] terrain) {
		this.terrain = terrain;
	}
	
	/**
	 * Returns IArea array of objects
	 * @param terrain
	 */
	public IArea[][] getTerrain() {
		return terrain;
	}
}
