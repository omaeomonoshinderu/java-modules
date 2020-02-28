package _02_Cities;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestCityTaxes {

	@Test
	public void testPrjections() {
		ArrayList<City> cities = new ArrayList<City>();
		City sd = new SanDiego(1407000, 3.5);
		City bo = new Boston(673184, 2.8);
		City la = new LosAngeles(3976000, 2.15);
		City at = new Atlanta(472522, 2.40);
		
		cities.add(sd);
		cities.add(bo);
		cities.add(la);
		cities.add(at);
		
		assertEquals(5924500.0, cities.get(0).getAnnualTaxes(), 0.01);
		assertEquals(2221507.2, cities.get(1).getAnnualTaxes(), 0.01);
		assertEquals(8798400.0, cities.get(2).getAnnualTaxes(), 0.01);
		assertEquals(1063174.5, cities.get(3).getAnnualTaxes(), 0.01);
	}

}
