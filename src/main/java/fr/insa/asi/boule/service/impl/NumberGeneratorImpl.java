package fr.insa.asi.boule.service.impl;

import java.util.HashMap;
import java.util.Map;

import fr.insa.asi.boule.model.Number;
import fr.insa.asi.boule.service.NumberGenerator;

public class NumberGeneratorImpl implements NumberGenerator {
	
	Map<Integer, Number> figures;

	public NumberGeneratorImpl() {
		figures = new HashMap<>();
		figures.put(1, Number.N1);
		figures.put(2, Number.N2);
		figures.put(3, Number.N3);
		figures.put(4, Number.N4);
		figures.put(5, Number.N5);
		figures.put(6, Number.N6);
		figures.put(7, Number.N7);
		figures.put(8, Number.N8);
		figures.put(9, Number.N9);
	}
	
	public Number generate() {
		int value = (int) Math.floor(1 + Math.random() * 9);
		return figures.get(value);
	}

}
