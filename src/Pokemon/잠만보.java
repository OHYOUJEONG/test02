package Pokemon;

public class �Ḹ�� extends Pokemon {
	
	public �Ḹ��(){
		
		super.name = "�Ḹ��";
		super.type = "��";
		super.hp = 300;
		super.atk = 300;
		super.def = 100;
		
	}
	
	
	
	@Override
	public String toString() {
		return "�Ḹ�� [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}



	public int sAttack() {
		return 3 * super.atk ;
	}

}
