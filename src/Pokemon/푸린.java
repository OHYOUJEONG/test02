package Pokemon;

public class Çª¸° extends Pokemon {
	
	public Çª¸°(){
		
		super.name = "Çª¸°";
		super.type = "³ë·¡";
		super.hp = 80;
		super.atk = 60;
		super.def = 70;
		
	}
	
	
	@Override
	public String toString() {
		return "Çª¸° [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}



	public int sAttack() {
		return 3 * super.atk ;
	}

}
