package fr.insa.asi.boule.service;

import fr.insa.asi.boule.model.Bet;

public interface BouleGame {

	/**
	 * This method has to generate a random number and if you lose, you win 1x or 7x your bet.
	 * https://fr.wikipedia.org/wiki/Jeu_de_la_boule_%28jeu_de_casino%29
	 * 
	 * @param bet the user bet
	 * @return 0 if you lose, 1 if you win with an not-number bet or 7 if you bet on a number
	 */
	int bet(Bet bet);

}
