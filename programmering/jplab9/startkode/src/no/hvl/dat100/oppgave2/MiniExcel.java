package no.hvl.dat100.oppgave2;

public class MiniExcel {

	private static int[][] data = { 	
			{ 1, 2, 0 }, 
			{ 3, 4, 0 },
			{ 5, 6, 0 }, 
			{ 0, 0, 0 } 
			
	};

	public static void skrivUt() {

		System.out.println("---------------");

		for (int[] x : data) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
	}

	public static void beregnSum() {

		for (int i = 0; i < data.length; i++) {
			int sum = 0;
			for (int j = 0; j < data[i].length; j++) {
				sum += data[i][j];
			}
			data[i][data[i].length - 1] = sum;
		}


		for (int i = 0; i < data.length - 1; i++) {
			int sumCol = 0;
			for (int j = 0; j < data[i].length; j++) {
				sumCol += data[j][i];
			}
			if (i < data[i].length - 1) {
				data[data.length - 1][i] = sumCol;
			}
		}

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
