package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {


	String analysis;
	String string;
	double totalRadiation;
	IMapCreator mc;
	ArrayList<IArea> path;
	
	public IMapCreator getMapCreator() {return mc;}
	public void setMapCreator(IMapCreator mc) {this.mc = mc;}

	public ArrayList<IArea> getPath() {return path;}
	public void setPath(int startRow, int startColumn) {
		path = mc.getScanner().getPath(startRow, startColumn);
	}

	public void analyzePath() {
		totalRadiation = 0;
		for (int i = 0; i < path.size(); i++) {
			totalRadiation += path.get(i).getRadiation();
		}
	}
		
	public String getAnalysis() {return analysis;}
	public void setAnalysis() {
		analysis = String.format("Energy Information: %f", totalRadiation);
	}

	public double calculateEnergy() {
		double totalEnergy = 0;
		for (int i = 0; i < path.size(); i++) {
			totalEnergy += path.get(i).calcConsumedEnergy();
		}
		return totalEnergy;
	}

	public String toString() {
		string = "Radiation Information: ";
		return string;
	}
}
