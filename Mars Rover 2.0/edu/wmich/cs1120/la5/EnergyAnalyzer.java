package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	public String analysis;
	public ArrayList<IArea> path;
	
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
		double total = 0;
		for (int i = 0; i < path.size(); i++) {
			total += path.get(i).calcConsumedEnergy();
		}
		setAnalysis(total + "");
	}
	
	@Override
	public String toString() {
		return "Energy Information:";
	}
}
