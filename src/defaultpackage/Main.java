package defaultpackage;

import Pokemon.Pokemon;
import Pokemon.�Ḹ��;
import Pokemon.Ǫ��;
import Pokemon.��ī��;

public class Main {

	public static void main(String[] args) {
		
		//���ϸ� ��ӹ޾����� Pokemon���� ��ĳ���� �ϱ� : �θ�Ÿ������ Ŭ���� ��������
		Pokemon[] ���ϸ� = new Pokemon[3];
		
		Pokemon ��ī��1 = new ��ī��();
		Pokemon Ǫ��1 = new Ǫ��();
		Pokemon �Ḹ��1 = new �Ḹ��();
		
		���ϸ�[0] = ��ī��1;
		���ϸ�[1] = Ǫ��1;
		���ϸ�[2] = �Ḹ��1;
		
		System.out.println(���ϸ�[0].toString());
		
		//�θ�Ŭ�������� ��ӹ��� �ڽ�Ŭ������ ������ ���� ��
		//�θ�Ŭ���� ���·� �ν��Ͻ�(��ü)�� �����ϸ�
		//�θ�Ŭ���� �迭�� �����͸� �ٷ� �� �ִ�
		
		//Pokemon - > ��ī��
		//������ - > ��Ÿ��
		//Quiz ��ī��� ��Ÿ���� �迭�� �ְ� �;��
		//��� �ϸ� ���� �� �������? //���� : �ϴ� Object
//		Object[] obj = new Object[3];
//		obj[0] = ��ī��;
		

//		�ٸ� ��Ű���� �ִ� ���� �����ö��� import�� �ϱ�!!!
//		Pokemon ��ī��1 = new ��ī��();
//		System.out.println("����� ���� : " + ��ī��1.sAttack());
//		System.out.println(��ī��1.toString() + "\n");
		
//		Pokemon Ǫ��1 = new Ǫ��();
//		System.out.println("����� ���� : " + Ǫ��1.sAttack());
//		System.out.println(Ǫ��1.toString()+ "\n");
		
//		Pokemon �Ḹ��1 = new �Ḹ��();
//		System.out.println("����� ���� : " + �Ḹ��1.sAttack());
//		System.out.println(�Ḹ��1.toString());
	}

}
