package projet_agile_gr3;


public class Monster extends Entity {

	public Monster(int y, int x, int levelmap, String name, int vie, int degatsMagiques, int degatsPhysiques) {
		super(y, x, levelmap, name, vie, degatsMagiques, degatsPhysiques);
	}
	
	public Monster(int y, int x, int levelmap, String name) {
		this(y, x, levelmap, name, AskAndDisplay.getRandomNumberInRange(5, 10)+levelmap, AskAndDisplay.getRandomNumberInRange(1, 3)+levelmap, AskAndDisplay.getRandomNumberInRange(1, 3)+levelmap);
	}
	//methode action rand magique/physique

}

