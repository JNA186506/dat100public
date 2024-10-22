package no.hvl.dat100.oppgave3;

public class Terning {

	// aktuell verdi for terningen
	private int oyne;

	public Terning() {
		this.oyne = oyne;
	}

	public int getOyne() {
		return oyne;
	}

	public void trill() {
		oyne = (int)(Math.random()*6+1);
	}
	
}