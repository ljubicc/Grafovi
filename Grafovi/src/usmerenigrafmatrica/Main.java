package usmerenigrafmatrica;

public class Main {

	public static void main(String[] args) {
		
		Graf graf = new Graf(5);
		
		// pravimo cvorove grafa
		graf.dodajCvor(new Cvor('A'));
		graf.dodajCvor(new Cvor('B'));
		graf.dodajCvor(new Cvor('C'));
		graf.dodajCvor(new Cvor('D'));
		graf.dodajCvor(new Cvor('E'));
		
		// pravimo veze izmedju cvorova grava
		graf.dodajVezu(0, 1);
		graf.dodajVezu(1, 2);
		graf.dodajVezu(2, 3);
		graf.dodajVezu(2, 4);
		graf.dodajVezu(4, 0);
		graf.dodajVezu(4, 2);
		
		// ispisujemo (crtamo) graf
		graf.stampaj();
		
		// primer provere postojanja veze izvedju prvog i drugog cvora
		System.out.println("Izmedju prvog i drugog cvora postoji veza : " + graf.daLiPostojiVeza(0, 1));
		
	}

}
