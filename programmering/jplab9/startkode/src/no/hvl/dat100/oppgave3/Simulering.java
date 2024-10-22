package no.hvl.dat100.oppgave3;

public class Simulering {

	private int[] diceRolled;
	private Terning terning = new Terning();
	
	public Simulering(int antall) {
		this.diceRolled = new int[antall];
	}
	
	public int[] getDiceRolled() { return diceRolled; }

	public int[] dice() {
		for (int i = 0; i < diceRolled.length; i++) {
			terning.trill();
			diceRolled[i] = terning.getOyne();
		}
		return diceRolled;
	}

}
