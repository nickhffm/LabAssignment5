package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * Class for gathering elevation information.
 * @author Macallister Armstrong
 */
public class ElevationAnalyzer implements IRover {

	private String analysis;
	private ArrayList<IArea> path;
	
	/**
	 * Empty constructor for the ElevationAnalyzer class.
	 */
	public ElevationAnalyzer() {}
	
	/**
	 * Returns path.
	 * @return path
	 */
	@Override
	public ArrayList<IArea> getPath() {return path;}
	/**
	 * Sets path.
	 * @param path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {this.path = path;}
	
	/**
	 * Returns analysis.
	 * @return analysis
	 */
	@Override
	public String getAnalysis() {return analysis;}
	/**
	 * Sets analysis.
	 * @param analysis
	 */
	@Override
	public void setAnalysis(String analysis) {this.analysis = analysis;}

	/**
	 * Analyzes path.
	 */
	@Override
	public void analyzePath() {
		double average_elevation = 0;
		for (int i = 0; i < path.size(); i++) {
			average_elevation += path.get(i).getElevation();
		}
		average_elevation /= path.size();
		setAnalysis(toString() + String.format("%.6f", average_elevation));
	}
	
	/**
	 * Returns label for analyzer
	 * @return label
	 */
	@Override
	public String toString() {
		String label = "Average Elevation: ";
		return label;
	}
}
