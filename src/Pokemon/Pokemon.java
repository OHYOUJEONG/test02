package Pokemon;
//abstract 추상클래스
public abstract class Pokemon {
	
	
	//필드
	protected String name;
	protected String type;
	protected int hp;
	protected int atk;
	protected int def;
	
		
	
	//리턴값
	public int attack() {
		return atk;
	}
	
	//추상 메소드
	public abstract int sAttack();
		


}
