package usmerenigraflista;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graf {
	
	ArrayList<LinkedList<Cvor>> alist;
	
	public Graf() {
		alist = new ArrayList<>();
	}
	
	public void dodajCvor(Cvor cvor) {
		LinkedList<Cvor> currentlist = new LinkedList<>();
		currentlist.add(cvor);
		alist.add(currentlist);
	}
	
	public void dodajVezu(int od, int ka) {
		// promenljivoj currentList dodeljujemo adresu LinkedListe-e ciji smo index (od) prosledili metodi 
		// ta LindedLista se nalazi u polju alist
		LinkedList<Cvor> currentList = alist.get(od);
		// adresu prvog cvora odredisne liste dodeljujemo promenljivoj cvor == odredisni cvor
		Cvor cvor = alist.get(ka).get(0);
		// cvor dodajemo u current listu (lisu cvora koji povezujemo == izvorni cvor)
		currentList.add(cvor);
		//alist.get(od).add(cvor);  moze i ovako, bez pravljenja currentList,
		// u ovom slucaju listi  cvora koga povezujemo dodajemo cvor koji povezujemo 
	}
	
	public boolean daLiPostojiVeza(int od, int ka) {
		LinkedList<Cvor> currentList = alist.get(od);
		Cvor kaCvor = alist.get(ka).get(0);
		
		// prolazimo kroz linked listu gde se nalazi pocetni cvor veze
		for(Cvor cv : currentList) {
			// proveravamo da li se u toj listi nalazi odredisni cvor veze
			if(cv == kaCvor) {
				return true;
			}
		}
		return false;
	}
	
	// vizualni prikaz grafa sa strelicom koja ukazuje na vezu
	public void stampaj() {
		for(LinkedList<Cvor> currentList : alist) {
			for(Cvor cv : currentList) {
				System.out.print(cv.podatak + " -> ");
			}
			System.out.println();
		}
	}
}
