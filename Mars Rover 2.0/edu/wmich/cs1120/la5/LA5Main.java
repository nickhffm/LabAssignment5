package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import java.io.*;

public class LA5Main {
	
	static IArea[][] terrain;

	public static void main(String[] args) {
		MainWindow.startGUI();
		IRover rover = new Rover();
		IMapCreator mc = new MapCreatorFromTxt();
		rover.setMapCreator(mc);
		TerrainScanner ts = new TerrainScanner();
		mc.setScanner(ts);
		setTerrain(mc.getTerrain());
		try {
			mc.scanTerrain("terrain.txt", 8);
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void setTerrain(IArea[][] pTerrain) {terrain = pTerrain;}
}
