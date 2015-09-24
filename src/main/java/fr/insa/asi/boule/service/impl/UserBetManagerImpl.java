package fr.insa.asi.boule.service.impl;

import fr.insa.asi.boule.model.Bet;
import fr.insa.asi.boule.model.User;
import fr.insa.asi.boule.service.BouleGame;
import fr.insa.asi.boule.service.UserBetManager;

public class UserBetManagerImpl implements UserBetManager {

	private BouleGame game;
	
	public void setGame(BouleGame game) {
		this.game = game;
	}
	
	@Override
	public void bet(User user, Bet bet, int betAmount) {
		// TODO Auto-generated method stub
		
	}

}
