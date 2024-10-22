package no.hvl.dat100.oppgave3;

public class Utskrift {

	Simulering sim = new Simulering(100);
	Terning terning = new Terning();
	private int[] antall = new int[6];
	int[] diceRolls = sim.getDiceRolled();

	public void utskrift() {
		for (int i = 0; i < diceRolls.length; i++) {
			System.out.print(sim.dice()[i] + "" + (((i + 1) % 20 == 0) ? "\n" : " "));
		}
	}

	public void antallOyne() {
		for (int i = 0; i < diceRolls.length; i++) {
			switch (diceRolls[i]) {
			case 1:
				antall[0]++;
				break;
			case 2:
				antall[1]++;
				break;
			case 3:
				antall[2]++;
				break;
			case 4:
				antall[3]++;
				break;
			case 5:
				antall[4]++;
				break;
			case 6:
				antall[5]++;
				break;
			}
		}
		for (int i = 0; i < antall.length; i++) {
			System.out.println("Antall terningkast på " + (i + 1) + ": " + antall[i]);
		}
	}

}
