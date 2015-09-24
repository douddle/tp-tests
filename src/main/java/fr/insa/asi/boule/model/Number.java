package fr.insa.asi.boule.model;

public enum Number {

	F1(1, false, false),
	F2(2, false, true),
	F3(3, false, false),
	F4(4, false, true),
	F5(5, false, true),
	F6(6, true, false),
	F7(7, true, true),
	F8(8, true, true),
	F9(9, true, false);
	
	private int valeur;
	
	private boolean passe;
	
	private boolean rouge;
	
	Number(int value, boolean passe, boolean red) {
		this.valeur = value;
		this.passe = passe;
		this.rouge = red;
	}
	
	public int getValue() {
		return this.valeur;
	}
	
	public boolean isPasse() {
		return this.passe;
	}

	public boolean isRed() {
		return this.rouge;
	}
	
	public boolean isPair() {
		return this.valeur % 2 == 0;
	}

}
