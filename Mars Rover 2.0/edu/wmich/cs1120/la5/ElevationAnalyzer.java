package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {

	String analysis = "";
	double averageElevation = 0;
	ArrayList<IArea> path = new ArrayList<IArea>();

	public ArrayList<IArea> getPath() {return path;}
	public void setPath(ArrayList<IArea> pPath) {path = pPath;}

	public void analyzePath() {
		double elevation = 0;
		for (int i = 0; i < path.size(); i++) {
			elevation += path.get(i).getElevation();
		}
		averageElevation = elevation / path.size();
	}
	
	public String getAnalysis() {return analysis;}
	public void setAnalysis(String analysis) {this.analysis = analysis;}
	
	public String toString() {
		String label = String.format("Elevation Information: %f", averageElevation);
		return label;
	}
}
