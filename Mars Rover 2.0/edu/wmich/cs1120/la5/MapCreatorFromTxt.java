package edu.wmich.cs1120.la5;

import java.io.*;
import java.util.Scanner;

import edu.wmich.cs1120.la5.TerrainScanner;

/**
 * Creates MapCreator object.
 * Fills Area objects and populates terrain.
 * @author Macallister Armstrong
 */
public class MapCreatorFromTxt implements IMapCreator {

	private IArea[][] terrain;
	private TerrainScanner ts;
	
	/**
	 * Empty constructor for the MapCreator class.
	 */
	public MapCreatorFromTxt() {
		terrain = new Area[10][10];
		ts = new TerrainScanner();
	}

	/**
	 * Sets Area object matrix.
	 * @param terrain
	 */
	public void setTerrain(IArea[][] terrain)     
		{this.terrain = terrain;}
	/**
	 * Returns Area object matrix.
	 * @return terrain
	 */
	public IArea[][] getTerrain()                 
		{return terrain;}
	
	/**
	 * Sets TerrainScanner object.
	 * @param ts
	 */
	public void setScanner(TerrainScanner ts)    
		{this.ts = ts;}
	/**
	 * Returns TerrainScanner object.
	 * @return ts
	 */
	public TerrainScanner getScanner()           
		{return ts;}
	
	/**
	 * Fills terrain with Area objects.
	 * Sets terrain on TerrainScanner object.
	 * @param fileName
	 * @param threshold
	 */
	public void scanTerrain(String fileName, int threshold) throws FileNotFoundException {
		Scanner inFile = new Scanner(new File(fileName));
		String aLine;
		String[] lineStrings;
		double radiation, elevation, basicEnergyCost;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				aLine = inFile.nextLine();
				lineStrings = aLine.split(" ");
				basicEnergyCost = Double.parseDouble(lineStrings[0]);
				elevation = Double.parseDouble(lineStrings[1]);
				radiation = Double.parseDouble(lineStrings[2]);
				if ((radiation < .5 && elevation > threshold * .5) || (radiation >= .5)) {
					Area oneLocation = new HighArea();
					oneLocation.setBasicEnergyCost(basicEnergyCost);
					oneLocation.setElevation(elevation);
					oneLocation.setRadiation(radiation);
					oneLocation.setEnergy_Cost(basicEnergyCost);
					terrain[i][j] = oneLocation;
				} else {
					Area oneLocation = new LowArea();
					oneLocation.setBasicEnergyCost(basicEnergyCost);
					oneLocation.setElevation(elevation);
					oneLocation.setRadiation(radiation);
					oneLocation.setEnergy_Cost(basicEnergyCost);
					terrain[i][j] = oneLocation;
				}	
			}
		}
		inFile.close();
		getScanner().setTerrain(terrain);
		setTerrain(terrain);
	}
}
