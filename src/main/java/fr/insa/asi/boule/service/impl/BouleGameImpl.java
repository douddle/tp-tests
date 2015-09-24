package fr.insa.asi.boule.service.impl;

import fr.insa.asi.boule.model.Bet;
import fr.insa.asi.boule.service.BouleGame;
import fr.insa.asi.boule.service.NumberGenerator;

public class BouleGameImpl implements BouleGame {

	private NumberGenerator generator;
	
	public void setNumberGenerator(NumberGenerator generator) {
		this.generator = generator;
	}
	
	@Override
	public int bet(Bet bet) {
		// TODO Auto-generated method stub
		return 0;
	}

}
