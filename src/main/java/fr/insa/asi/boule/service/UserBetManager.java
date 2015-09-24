package fr.insa.asi.boule.service;

import fr.insa.asi.boule.model.Bet;
import fr.insa.asi.boule.model.User;

public interface UserBetManager {

	void bet(User user, Bet bet, int betAmount);

}
