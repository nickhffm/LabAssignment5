package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import java.io.*;

public class LA5Main {
	
	static IArea[][] terrain;

	public static void main(String[] args) {
		MainWindow.startGUI();
	}
	
	public static void setTerrain(IArea[][] pTerrain) {terrain = pTerrain;}
}
