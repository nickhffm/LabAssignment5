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

	private IArea[][] terrain = new Area[10][10];
	private TerrainScanner ts = new TerrainScanner();
	
	/**
	 * Read from the file, set up the IArea[10][10] and set the terrain for the object of TerrainScanner
	 * 
	 * @param fileName
	 * @param threshold
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws FileNotFoundException {
		
		RandomAccessFile dataFile = new RandomAccessFile(fileName, "r");
		double basicEnergyCost, elevation, radiation;
		
		String header = String.format("%12s %12s %12s %12s", 
				"basic_energy", "elevation", "radiation", "energy_cost");
		System.out.println(header);
		
		int r=0;
		int c=0;
		int position = 0;
		
		do {
			try {
				dataFile.seek(position*34);
				
				basicEnergyCost = dataFile.readDouble();
				elevation = dataFile.readDouble();
				radiation = dataFile.readDouble();
				
				char operator = dataFile.readChar();
				int val1 = dataFile.readInt();
				int val2 = dataFile.readInt();
				
				if ((radiation < .5 && elevation > threshold * .5) || (radiation >= .5)) {
					Area oneLocation = new HighArea();
					oneLocation.setBasicEnergyCost(basicEnergyCost);
					oneLocation.setElevation(elevation);
					oneLocation.setRadiation(radiation);
					oneLocation.setEnergy_Cost(basicEnergyCost);
					terrain[r][c] = oneLocation;
					System.out.println(oneLocation.toString());
				} else {
					Area oneLocation = new LowArea();
					oneLocation.setBasicEnergyCost(basicEnergyCost);
					oneLocation.setElevation(elevation);
					oneLocation.setRadiation(radiation);
					oneLocation.setEnergy_Cost(basicEnergyCost);
					terrain[r][c] = oneLocation;
					System.out.println(oneLocation.toString());
				}	
				
				IExpression ef = ExpressionFactory.getExpression(operator, val1, val2);
				position = ef.getValue();
				
				c++;
				if (c == 10) {
					r++;
					c = 0;
				}
			}
			
			catch (IOException e) {
				System.out.println("Invalid file format");
			}
			
		} while(position != -1);
		
		try {
			dataFile.close();
		} 
		catch (IOException e) {
			System.out.println("Unable to close file.");
		}
		getScanner().setTerrain(terrain);
		setTerrain(terrain);
	}
	
	/**
	 * Returns TerrainScanner object.
	 * @return ts
	 */
	@Override
	public TerrainScanner getScanner() {
		return ts;
	}
	
	/**
	 * Sets TerrainScanner object.
	 * @param scanner
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		ts = scanner;
	}
	
	/**
	 * Sets IArea array of objects
	 * @param terrain
	 */
	@Override
	public void setTerrain(IArea[][] terrain) {
		this.terrain = terrain;
	}
	
	/**
	 * Returns IArea array of objects
	 * @param terrain
	 */
	@Override
	public IArea[][] getTerrain() {
		return terrain;
	}
}
