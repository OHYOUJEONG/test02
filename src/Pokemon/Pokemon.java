package Pokemon;
//abstract �߻�Ŭ����
public abstract class Pokemon {
	
	
	//�ʵ�
	protected String name;
	protected String type;
	protected int hp;
	protected int atk;
	protected int def;
	
		
	
	//���ϰ�
	public int attack() {
		return atk;
	}
	
	//�߻� �޼ҵ�
	public abstract int sAttack();
		


}
