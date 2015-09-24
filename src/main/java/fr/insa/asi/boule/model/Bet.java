package fr.insa.asi.boule.model;

public enum Bet {

	NUMBER1(true),
	NUMBER2(true),
	NUMBER3(true),
	NUMBER4(true),
	NUMBER5(true),
	NUMBER6(true),
	NUMBER7(true),
	NUMBER8(true),
	NUMBER9(true),
	RED(false),
	BLACK(false),
	IMPAIR(false),
	PAIR(false),
	MANQUE(false),
	PASSE(false);

	private boolean numberBet;
	
	public boolean isNumber() {
		return this.numberBet;
	}
	
	Bet(boolean numberBet) {
		this.numberBet = numberBet;
	}

}
