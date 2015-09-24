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
		figures.put(Number.N1, 0);
		figures.put(Number.N2, 0);
		figures.put(Number.N3, 0);
		figures.put(Number.N4, 0);
		figures.put(Number.N5, 0);
		figures.put(Number.N6, 0);
		figures.put(Number.N7, 0);
		figures.put(Number.N8, 0);
		figures.put(Number.N9, 0);
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
