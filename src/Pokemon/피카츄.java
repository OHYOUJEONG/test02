package Pokemon;

public class 피카츄 extends Pokemon {
	
	//1. Pokemon 클래스를 상속(extents)받아주세요.
	//2. 매개변수 5개짜리 생성자를 만들어주세요.
	//3. sAttack()을 오버라이딩해서 원래 2배 공격력으로
	//	 되어 있던 기능을 3배로 변경해 주세요.
	//4. 2개의 포켓몬을 더 만들어주세요.
	
	//매개변수 5개짜리 생성자
	public 피카츄() {

		//부모클래스를 받기 때문에 this가 아닌 super로 쓰자!
		 super.name = "피카츄";
		 super.type = "전기";
		 super.hp = 100;
		 super.atk = 200;
		 super.def = 50;
	}
	
	
	@Override
	public String toString() {
		return "피카츄 [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}


	@Override
	public int sAttack() {
		return 3 * super.atk;
	}



	

}
