package Pokemon;

public class ��ī�� extends Pokemon {
	
	//1. Pokemon Ŭ������ ���(extents)�޾��ּ���.
	//2. �Ű����� 5��¥�� �����ڸ� ������ּ���.
	//3. sAttack()�� �������̵��ؼ� ���� 2�� ���ݷ�����
	//	 �Ǿ� �ִ� ����� 3��� ������ �ּ���.
	//4. 2���� ���ϸ��� �� ������ּ���.
	
	//�Ű����� 5��¥�� ������
	public ��ī��() {

		//�θ�Ŭ������ �ޱ� ������ this�� �ƴ� super�� ����!
		 super.name = "��ī��";
		 super.type = "����";
		 super.hp = 100;
		 super.atk = 200;
		 super.def = 50;
	}
	
	
	@Override
	public String toString() {
		return "��ī�� [name=" + name + ", type=" + type + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}


	@Override
	public int sAttack() {
		return 3 * super.atk;
	}



	

}
