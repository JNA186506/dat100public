package no.hvl.dat100.oppgave3;

public class Utskrift {

	private Simulering sim = new Simulering(100);
	private int[] diceRolls = sim.dice();
	private String[] dice = new String[6];

	public void utskrift() {
		int tall = 0;
		String[] terningResultat = convertedToOyne();
		for (int i = 0; i < diceRolls.length; i++) {
			System.out.print(terningResultat[i] + "" + (((i + 1) % 20 == 0) ? "\n" : " "));
			tall++;
			
		}
		System.out.println("Antall kast: " + tall);
		
		int[] antallResultat = antall();
		for (int i = 0; i < antall().length; i++) {
			System.out.println("Antall " + dice[i] + "-ere: " + antallResultat[i]);
		}
	}

	public int[] antall() {
		int[] antall = new int[6];
		for (int i = 0; i < diceRolls.length; i++) {
			int roll = diceRolls[i] - 1;
			
			antall[roll]++;
			
			dice[roll] = getDiceFace(diceRolls[i]);
			}
		return antall;
	}
	
	public String getDiceFace(int diceRoll) {
		switch (diceRoll) {
		case 1:
			return "[ . ]";
		case 2:
			return "[ : ]";
		case 3:
			return "[...]";
		case 4:
			return "[: :]";
		case 5:
			return "[:.:]";
		case 6:
			return "[:::]";
		default:
			return "";
		}
	}
	
	public String[] convertedToOyne() {
		String[] terningString = new String[diceRolls.length];
		for (int i = 0; i < diceRolls.length; i++) {
			terningString[i] = getDiceFace(diceRolls[i]);
		}
		return terningString;
	}
}
