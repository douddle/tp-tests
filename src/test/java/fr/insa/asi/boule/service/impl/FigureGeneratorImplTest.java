package fr.insa.asi.boule.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

import fr.insa.asi.boule.model.Number;
import fr.insa.asi.boule.service.NumberGenerator;

public class FigureGeneratorImplTest extends NumberGeneratorImpl {

	@Test
	public void shouldFiguresReallyRandom() {
		NumberGenerator generator = new NumberGeneratorImpl();
		Map<Number, Integer> figures = new HashMap<>();
		figures.put(Number.F1, 0);
		figures.put(Number.F2, 0);
		figures.put(Number.F3, 0);
		figures.put(Number.F4, 0);
		figures.put(Number.F5, 0);
		figures.put(Number.F6, 0);
		figures.put(Number.F7, 0);
		figures.put(Number.F8, 0);
		figures.put(Number.F9, 0);
		for (int i = 0; i < 9000; i++) {
			Number f = generator.generate();
			figures.put(f, figures.get(f) + 1);
		}
		for (Entry<Number, Integer> entry : figures.entrySet()) {
			Assert.assertTrue("Figure " + entry.getKey().getValue() + " occurs " +  entry.getValue() + ", less than 900", entry.getValue() > 900);
			Assert.assertTrue("Figure " + entry.getKey().getValue() + " occurs " +  entry.getValue() + ", more than 1100", entry.getValue() < 1100);
		}
	}

}
