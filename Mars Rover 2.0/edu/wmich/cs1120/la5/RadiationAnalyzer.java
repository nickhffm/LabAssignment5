package edu.wmich.cs1120.la5;

import java.util.ArrayList;

/**
 * Class for gathering radiation information.
 * @author Macallister Armstrong
 */
public class RadiationAnalyzer implements IRover {

	private String analysis;
	private ArrayList<IArea> path;
	
	/**
	 * Empty constructor for the RadiationAnalyzer class.
	 */
	public RadiationAnalyzer() {}
	
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
		double total = 0;
		for (int i = 0; i < path.size(); i++) {
			total += path.get(i).getRadiation();
		}
		setAnalysis(toString() + totalRadiation);
	}

	/**
	 * Return label for the analyzer.
	 * @return label
	 */
	@Override
	public String toString() {
		String label = "Total Radiation: ";
		return label;
	}
}
