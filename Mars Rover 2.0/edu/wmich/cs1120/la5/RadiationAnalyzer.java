package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {

	String analysis = "";
	double totalRadiation = 0;
	ArrayList<IArea> path = new ArrayList<IArea>();
	
	public ArrayList<IArea> getPath() {return path;}
	public void setPath(ArrayList<IArea> pPath) {path = pPath;}
	
	public void analyzePath() {
		for (int i = 0; i < path.size(); i++) {
			totalRadiation += path.get(i).getRadiation();
		}
	}
	
	public String getAnalysis() {return analysis;}
	public void setAnalysis(String analysis) {this.analysis = analysis;}

	public String toString() {
		String label = String.format("Radiation Information: %f", totalRadiation);
		return label;
	}
}
