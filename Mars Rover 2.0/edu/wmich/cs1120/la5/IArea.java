package edu.wmich.cs1120.la5;

/**
 * Interface for the Area class.
 * @author Macallister Armstrong
 */
public interface IArea {
	
	/**
	 * Returns basicEnergyCost.
	 * @return basicEnergyCost	 */
	double getBasicEnergyCost();
	/**
	 * Sets basicEnergyCost.
	 * @param basicEnergyCost
	 */
	void setBasicEnergyCost(double basicEnergyCost);
	
	/**
	 * Returns elevation.
	 * @return elevation
	 */
	double getElevation(); 
	/**
	 * Sets elevation.
	 * @param elevation
	 */
	void setElevation(double elevation);
	
	/**
	 * Returns radiation.
	 * @return radiation
	 */
	double getRadiation();
	/**
	 * Sets radiation.
	 * @param radiation
	 */
	void setRadiation(double radiation);
	
	/**
	 * Calculates energy consumed in a location.
	 * @return energy_cost
	 */
	double calcConsumedEnergy();
}

