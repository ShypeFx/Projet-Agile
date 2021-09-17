package projet_agile_gr3;



public class Player extends Entity {

	Items[] inventory;
	
	public Player(int y, int x, int levelmap, String name, int vie, int degatsMagiques, int degatsPhysiques, int inventorySize) {
		super(y, x, levelmap, name, vie, degatsMagiques, degatsPhysiques);
		inventory = new Items[inventorySize];
	}
	
	public Player(int y, int levelmap, int x, String name) {
		this(y, x, levelmap,name, 20 , 3, 3, 5);
	}
	
	public void action(Monster adversaire, String faiblesses) {
		int reponse;
		
		System.out.println("Quel Action voulez-vous faire ?");
		System.out.println("\t0 Pour attaque physique");
		System.out.println("\t1 Pour attaque magique");
		System.out.println("\t2 Pour attaque inspecter");

		reponse = AskAndDisplay.askValidNumber(0,3);
		
		switch(reponse) {
		  case 0:
			  this.attaque(adversaire, "physique");
		    break;
		  case 1:
			  this.attaque(adversaire, "magique");
		    break;
		  case 2:
			  faiblesses=this.inspecter(adversaire);
		    break;
		}
		
	}
	
	public String inspecter(Monster adversaire) {
		System.out.println("Inspection revele que faible est "+adversaire.faiblesse.name());
		return adversaire.faiblesse.name();
	}


	
}
