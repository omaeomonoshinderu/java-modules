package _02_Cities;

public abstract class City {
	protected int population;
	protected double taxRate;
	
	public City(int population, double taxRate) {
		this.population = population;
		this.taxRate = taxRate;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	
	abstract double getAnnualTaxes();
}
