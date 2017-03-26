package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {

	String analysis;
	String string;
	double totalEnergyCost;
	IMapCreator mc;
	ArrayList<IArea> path;
	
	public IMapCreator getMapCreator() {return mc;}
	public void setMapCreator(IMapCreator mc) {this.mc = mc;}

	public ArrayList<IArea> getPath() {return path;}
	public void setPath(int startRow, int startColumn) {
		path = mc.getScanner().getPath(startRow, startColumn);
	}

	public String getAnalysis() {return analysis;}
	public void setAnalysis() {
		analysis = String.format("Energy Information: %f", totalEnergyCost);
	}

	public double calculateEnergy() {
		double totalEnergy = 0;
		for (int i = 0; i < path.size(); i++) {
			totalEnergy += path.get(i).calcConsumedEnergy();
		}
		return totalEnergy;
	}
	
	public String toString() {
		string = "Energy Information: ";
		return string;
	}
}
