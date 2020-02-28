package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double taxRate) {
		super(population, taxRate);
	
	}

	@Override
	double getAnnualTaxes() {
		return 0; 
	}
	
}
