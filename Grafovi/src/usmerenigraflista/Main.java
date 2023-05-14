package usmerenigraflista;

public class Main {

	public static void main(String[] args) {
		
		// kreiranje grafa
		Graf graf = new Graf();
		
		// dodavanje cvorova u graf
		graf.dodajCvor(new Cvor('A'));
		graf.dodajCvor(new Cvor('B'));
		graf.dodajCvor(new Cvor('C'));
		graf.dodajCvor(new Cvor('D'));
		graf.dodajCvor(new Cvor('E'));
		
		// kreiranje veza izmedju cvorova grafa
		graf.dodajVezu(0, 1);
		graf.dodajVezu(1, 2);
		graf.dodajVezu(2, 3);
		graf.dodajVezu(1, 4);
		graf.dodajVezu(2, 4);
		graf.dodajVezu(4, 0);
		graf.dodajVezu(4, 2);
		
		// vizuelni prikaz grafa
		graf.stampaj();
		// odgovor na pitanje da li postoji veza izmedju cvorova grafa sa prosledjenim indeksima
		System.out.println(graf.daLiPostojiVeza(0, 4));
		
	}

}
