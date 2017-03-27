package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {

	public String analysis;
	public double average_elevation;
	public ArrayList<IArea> path;
	
	public ElevationAnalyzer() {
		analysis = "";
		average_elevation = 0.0;
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
		average_elevation = 0;
		for (int i = 0; i < path.size(); i++) {
			average_elevation += path.get(i).getElevation();
		}
		average_elevation /= path.size();
	}
	
	@Override
	public String toString() {
		//String label = String.format("Elevation Information: %f", averageElevation);
		String label = "Elevation";
		return label;
	}
}
