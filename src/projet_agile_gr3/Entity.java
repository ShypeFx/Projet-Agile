package projet_agile_gr3;

public class Entity {
	public int y;
	public int x;
	public int levelmap;
	public String name;
	public double vie;
	public int degatsMagiques;
	public int degatsPhysiques;
	public Weakness faiblesse;
	
	public Entity(int y, int x, int levelmap, String name, int vie, int degatsMagiques, int degatsPhysiques) {
		this.y = y;
		this.x = x;
		this.levelmap = levelmap;
		this.name = name;
		this.vie = vie;
		this.degatsMagiques = degatsMagiques;
		this.degatsPhysiques = degatsPhysiques;
	}
	
	public void attaque(Entity adversaire, String typeAttaque) {
		double multiplicateur = 1;
		
		if(adversaire.faiblesse.name().equalsIgnoreCase(typeAttaque)){
			multiplicateur=1.5;
		}
		
		switch(typeAttaque) {
		  case "physique":
			  adversaire.vie = adversaire.vie-this.degatsPhysiques*multiplicateur;
		    break;
		  case "magique":
			  adversaire.vie = adversaire.vie-this.degatsMagiques*multiplicateur;
		    break;
		}
	}
	public static void main(String[] args) {
		System.out.println("test");
	}
}


