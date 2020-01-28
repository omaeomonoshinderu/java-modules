package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double taxRate) {
		super(population, taxRate);
	}

	@Override
	double getAnnualTaxes() {
		return 0;
	}

}
