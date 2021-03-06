package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.Area;

/**
 * Can be used to create LowArea objects of dynamic type Area.
 * @author Macallister Armstrong
 */
public class LowArea extends Area {
	
	/**
	 * Empty constructor for LowArea class.
	 */
	public LowArea() {}
	
	/**
	 * Sets energy_cost. To be called from Rover method calculateEnergy.
	 * @param basicEnergyCost
	 */
	public void setEnergy_Cost(double basicEnergyCost)     
		{energy_cost = basicEnergyCost * 2;}

}

