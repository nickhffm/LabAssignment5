package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	public String analysis;
	public double totalEnergyCost;
	public ArrayList<IArea> path;
	
	public EnergyAnalyzer() {
		analysis = "";
		totalEnergyCost = 0.0;
		path = new ArrayList<IArea>();
	}
	
	@Override
	public ArrayList<IArea> getPath() {return path;}
	@Override
	public void setPath(ArrayList<IArea> path) {this.path = path;}
	@Override
	public String getAnalysis() {return analysis;}
	@Override
	public void setAnalysis(String analysis) {this.analysis = analysis;}

	@Override
	public void analyzePath() {
		for (int i = 0; i < path.size(); i++) {
			totalEnergyCost += path.get(i).calcConsumedEnergy();
		}
	}
	
	@Override
	public String toString() {
		analyzePath();
		String label = String.format("EnergyInformation: %f", totalEnergyCost);
		return label;
	}
}
