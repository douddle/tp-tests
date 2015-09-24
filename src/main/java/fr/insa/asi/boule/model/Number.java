package fr.insa.asi.boule.model;

public enum Number {

	N1(1, false, false),
	N2(2, false, true),
	N3(3, false, false),
	N4(4, false, true),
	N5(5, false, true),
	N6(6, true, false),
	N7(7, true, true),
	N8(8, true, true),
	N9(9, true, false);

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
