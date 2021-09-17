package projet_agile_gr3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Map {
	
	public int y;
	public int x;
	public Case [][] map;
	public Player j1;
	public List<Monster> monsters = new ArrayList<Monster>();
	public List<Case> cases = new ArrayList<Case>();
	
	public Map(int h, int l){
		this.y = h;
		this.x = l;
		this.map = new Case[x][y];
		
		// LVL 0 -> 5  --------- taille == 5 
		if (j1.levelmap >= 0 || j1.levelmap < 6 && y == 5 && x < 20) {
			for(int i = 0; i < 0 ; i++) {
				Case monstre = new Case(Caract.MONSTER,true);
				if( validEmplacement(map, x, y) == true) {
					placerMonstre(monstre, map, x, y);
				} 
			}
		}
		// LVL 0 -> 5  --------- taille entre 5 et 10px
		if (j1.levelmap >= 0 || j1.levelmap < 6 && (y > 5 || y <= 10) && x < 20) {
			for(int i = 0; i < 0 ; i++) {
				Case monstre = new Case(Caract.MONSTER,true);
				if( validEmplacement(map, x, y) == true) {
					placerMonstre(monstre, map, x, y);
				}
			}
		}
		// LVL 0 -> 5  --------- taille == 10
		if (j1.levelmap >= 0 || j1.levelmap < 6 && (y > 5 || y <= 10) && x < 20) {
			for(int i = 0; i < 0 ; i++) {
				Case monstre = new Case(Caract.MONSTER,true);
				if( validEmplacement(map, x, y) == true) {
					placerMonstre(monstre, map, x, y);
				}
			}
		}
		// LVL 0 -> 5  --------- taille entre 10 et 15px
		if (j1.levelmap >= 0 || j1.levelmap < 6 && (y > 5 || y <= 10) && x < 20) {
			for(int i = 0; i < 0 ; i++) {
				Case monstre = new Case(Caract.MONSTER,true);
				if( validEmplacement(map, x, y) == true) {
					placerMonstre(monstre, map, x, y);
				}
			}
		}
		// LVL 0 -> 5  --------- taille == 15px
		if (j1.levelmap >= 0 || j1.levelmap < 6 && (y > 5 || y <= 10) && x < 20) {
			for(int i = 0; i < 0 ; i++) {
				Case monstre = new Case(Caract.MONSTER,true);
				if( validEmplacement(map, x, y) == true) {
					placerMonstre(monstre, map, x, y);
				}
			}
		}	

	}
	
	
	public void placementTerrain() {
		initialiserTerrain();
		int lvl = j1.levelmap;
	}
	
	public void initialiserTerrain() {
		for (int y = 0; y < this.map.length ; y++) {
			for (int x = 0; x < this.map[x].length;x++) {
				Case c = new Case(Caract.MONSTER,false);

			}
		}
	}
	
	public void placerMonstre(Case c, Case[][] m, int hauteur, int largeur) {
		m[hauteur][largeur] = c;
	}
	
	public boolean validEmplacement(Case[][] carte, int x, int y) {
		boolean result = true;
		Case c = carte[x][y];
		if (c.getChar() == ' ') {
			result = true;
		}
		return result;
	}
	
	
	
	public String toString() {
		String result = "";
		for (int l = 0; l < this.map.length ; l++) {
			for (int h = 0; h < this.map[h].length;h++) {
				/*tableau[x][y] = x + y;*/
				result = result + map[x][y] + " - ";
			}
		}
		return result;
	}
	
}
