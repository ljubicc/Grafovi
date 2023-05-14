package usmerenigrafmatrica;

import java.util.ArrayList;

/*
 * Adjacency matrica
 *  USMERENI GRAF ne podrazumeva dvosmernu vezu izmedju dva cvora grafa
 */

public class Graf {
	
	ArrayList<Cvor> cvorovi;
	int[][] matrica;
	
	public Graf(int n) { // velicina grafa odnosno broj cvorova
		cvorovi = new ArrayList<>();
		matrica = new int[n][n]; // razlog prostorne slozenosti O(v^2)
	}
	
	public void dodajCvor(Cvor cvor) {
		cvorovi.add(cvor);
	}
	
	public void dodajVezu(int a, int b) {
		matrica[a][b] = 1;
	}
	
	// metoda vraca true ako postoji veze izmedju dva cvora 
	public boolean daLiPostojiVeza(int od, int ka) {
		return matrica[od][ka] == 1;
	}
	
	// vizuelni prikaz veza grafa (odnosno veza izmedju cvorova grafa)
	public void stampaj() {
		System.out.print("  ");
		for(Cvor cv : cvorovi) {
			System.out.print(cv.podatak + " ");
		}
		System.out.println();
		
		for (int i = 0; i < matrica.length; i++) {
			System.out.print(cvorovi.get(i).podatak + " ");
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
}
