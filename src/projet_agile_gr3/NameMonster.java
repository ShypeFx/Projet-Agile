package projet_agile_gr3;

public enum NameMonster {
	CHICKEN(1) 		,RAT(1) ,BAT(0.5) 	,VIPER(0.1)		,BEAR(0.9), 
	SCORPION (0.1)	,SPIDER(0.2) 		,SKELETON(0.9) 	,GOBLIN(0.5), 
	TROLL(0.7)		,MUMMY (0.8)		,GHOST(0.3) 	,GHOUL(0.8),
	DARK_ELF(0.1) 	,GRIFFIN (0.7)		,ORC(1) 		,ENT(0.2),
	GOLEM(0.5)		,WYVERN(0.8)		,WIZARD(0)		,DRAGON(0.8),
	GIANT(1)		,HYDRA(0.8)			,DEVIL(0)		,DEATH_ANGEL(0.5);
	
	NameMonster(double tauxAtkP) {
	}

	public double tauxAtkP;
	
}
