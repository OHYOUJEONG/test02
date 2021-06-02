package Pokemon;

public class 잠만보 extends Pokemon {
	
	public 잠만보(){
		
		super.name = "잠만보";
		super.type = "잠";
		super.hp = 300;
		super.atk = 300;
		super.def = 100;
		
	}
	
	
	
	@Override
	public String toString() {
		return "잠만보 [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}



	public int sAttack() {
		return 3 * super.atk ;
	}

}
