package Pokemon;

public class Ǫ�� extends Pokemon {
	
	public Ǫ��(){
		
		super.name = "Ǫ��";
		super.type = "�뷡";
		super.hp = 80;
		super.atk = 60;
		super.def = 70;
		
	}
	
	
	@Override
	public String toString() {
		return "Ǫ�� [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}



	public int sAttack() {
		return 3 * super.atk ;
	}

}
