package _02_Cities;

public class Boston extends City {

	public Boston(int population, double taxRate) {
		super(population, taxRate);
	}

	@Override
	double getAnnualTaxes() {
		return 0;
	}

}
