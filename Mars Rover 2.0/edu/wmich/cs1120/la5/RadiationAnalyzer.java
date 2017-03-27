package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {

	public String analysis;
	public double totalRadiation;
	public ArrayList<IArea> path;
	
	public RadiationAnalyzer() {
		analysis = "";
		totalRadiation = 0.0;
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
			totalRadiation += path.get(i).getRadiation();
		}
	}

	@Override
	public String toString() {
		String label = String.format("Radiation Information: %f", totalRadiation);
		return label;
	}
}
