package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.IArea;

/**
 * Creates Area objects.
 * @author Macallister Armstrong
 */
public abstract class Area implements IArea {

	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	protected double energy_cost;
	
	/**
	 * Empty constructor for Area class.
	 */
	public Area() {}
	
	/**
	 * Sets basicEnergyCost.
	 * @param basicEnergyCost
	 */
	public void setBasicEnergyCost(double basicEnergyCost) 
		{this.basicEnergyCost = basicEnergyCost;}
	/**
	 * Sets elevation.
	 * @param elevation
	 */
	public void setElevation(double elevation)             
		{this.elevation = elevation;}
	/**
	 * Sets radiation.
	 * @param radiation
	 */
	public void setRadiation(double radiation)             
		{this.radiation = radiation;}
	/**
	 * Sets energy_cost for LowArea and HighArea objects.
	 * @param basicEnergyCost
	 */
	public abstract void setEnergy_Cost(double basicEnergyCost);
	
	/**
	 * Returns basicEnergyCost.
	 * @return basicEnergyCost
	 */
	public double getBasicEnergyCost() 
		{return basicEnergyCost;}
	/**
	 * Returns elevation.
	 * @return elevation
	 */
	public double getElevation()       
		{return elevation;}
	/**
	 * Returns radiation.
	 * @return radiation
	 */
	public double getRadiation()       
		{return radiation;}
	/**
	 * Returns energy_cost.
	 * @return energy_cost
	 */
	public double getEnergy_Cost()     
		{return energy_cost;}
	
	/**
	 * Returns energy_cost.
	 * @return energy_cost
	 */
	public double calcConsumedEnergy() 
		{return energy_cost;}
}
