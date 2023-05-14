package neusmerenigrafmatrica;

public class Graf {

	private int temena; // broj temena grafa
	private int veze; // broj veza izmedju temena grafa
	private int[][] adjacMatrix;

	// konstruktor za kreiranje grafa sa brojem prosledjenih cvorova
	// broj veza postavljen na 0
	public Graf(int nodes) {
		this.temena = nodes;
		this.veze = 0;
		adjacMatrix = new int[nodes][nodes];
	}

	// metoda za kreiranje veza izmedju cvorova
	// metoda kreira neusmerenu vezu izmedju cvorova, npr. od 1 ka 2 i od 2 ka 1
	// cvoru
	public void addEdge(int red, int kolona) {
		this.adjacMatrix[red][kolona] = 1;
		this.adjacMatrix[kolona][red] = 1; // zato sto je ovo neusmereni graf
		veze++;
	}

	// vizuelna reprezentacija matrice (veza izmedju cvorova 0, 1, 2, i 3)
	public String toString() {
		String s = "";
		s += "  0 1 2 3";
		for (int i = 0; i < temena; i++) {
			s += "\n" + i + ":";
			for (int j = 0; j < veze; j++) {
				s += adjacMatrix[i][j] + " ";
			}
			System.out.println();
		}
		return s;
	}

	public static void main(String[] args) {

		Graf g = new Graf(4);

		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);

		System.out.println(g.toString());

	}
}
