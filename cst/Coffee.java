/************************************************************************************
 * Course: CSC 240 Java Programming                                                 *
 * Instructor: Carmella Garcia                                                      *
 * Module 4 Assignment 1: Coffee Sales Tracker                                      *
 * Due 07/22/15                                                                     *
 * Author: Marj Frederick                                                           *
 *                                                                                  *
 * This Coffee class is part of the CoffeeSalesTracker program                      *
 * This class allows the instantiation of Coffee objects. Each Coffee object can    *
 * calculate the sale price before tax, calculate the total tax and calculate the   *
 * total sale with tax.                                                             *
 *                                                                                  *
 * Constructors:                                                                    *
 * Coffee ();                                                                       *
 * Coffee (int bags, double weight);                                                *
 *                                                                                  *
 * Methods:                                                                         *
 * double getSale();                                                                *
 * double getSalesTax();                                                            *
 * double getTotalPrice();                                                          *
 * double getPrice();                                                               *
 * double getTaxRate();                                                             *
 *                                                                                  *
 * **********************************************************************************/
package cst;

public class Coffee
{
	// data field of class Coffee
	private int numberOfBags = 1;   // Default number of bags
	private double bagWeight = 1.;  // Default weight = 1 pound
	private final static double pricePerLB = 5.99;  
	private final static double taxRate = 0.0725;  // 7.25% 

// Constructors:
	// no-argument constructor creates a default coffee sale of 1 bag of coffee
	Coffee () { }
	
	// constructor that creates a coffee object with #ofbags & bagWeight defined by user
	Coffee (int bags, double weight)
	{
		this.numberOfBags = bags;
		this.bagWeight = weight;
	}

	// Return the number of bags purchased
	public int getNumberOfBags ()
	{
		return this.numberOfBags;
	}

// Get methods for data fields
	// Return the weight of the bag
	public double getBagWeight ()
	{
		return this.bagWeight;
	}
	
	// Return the price per pound
	public double getPrice ()
	{
		return this.pricePerLB;		
	}
	
	// Returns the Tax rate
	public double getTaxRate ()
	{
		return this.taxRate;
	}

// Set methods that allow setting data field elements
	// set the number of bags
	public void setNumberOfBags (int bags)
	{
		this.numberOfBags = bags;
	}
	
	// set the weight of the bags
	public void setBagWeight (double weight)
	{
		this.bagWeight = weight;
	}

// Calculation methods
	// Return the sale before tax
	double getSale()
	{
		return (this.bagWeight * this.numberOfBags * this.pricePerLB);
	}
	
	// Returns the Tax on the transaction
	double getSalesTax()
	{
		return (this.taxRate * getSale());
	}
	
	// Return totalPrice with tax
	double getTotalPrice()
	{
		return (getSale() + getSalesTax());	
	}
	
}
