package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	String analysis = "";
	double totalEnergyCost = 0;
	ArrayList<IArea> path = new ArrayList<IArea>();

	public ArrayList<IArea> getPath() {return path;}
	public void setPath(ArrayList<IArea> pPath) {path = pPath;}

	public void analyzePath() {
		for (int i = 0; i < path.size(); i++) {
			totalEnergyCost += path.get(i).calcConsumedEnergy();
		}
	}

	public String getAnalysis() {return analysis;}
	public void setAnalysis(String analysis) {this.analysis = analysis;}
	
	public String toString() {
		String label = String.format("EnergyInformation: %f", totalEnergyCost);
		return label;
	}
}
