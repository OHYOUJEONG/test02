package defaultpackage;

import Pokemon.Pokemon;
import Pokemon.잠만보;
import Pokemon.푸린;
import Pokemon.피카츄;

public class Main {

	public static void main(String[] args) {
		
		//포켓몬꺼 상속받았으니 Pokemon으로 어캐스팅 하기 : 부모타입으로 클래스 관리가능
		Pokemon[] 포켓몬 = new Pokemon[3];
		
		Pokemon 피카츄1 = new 피카츄();
		Pokemon 푸린1 = new 푸린();
		Pokemon 잠만보1 = new 잠만보();
		
		포켓몬[0] = 피카츄1;
		포켓몬[1] = 푸린1;
		포켓몬[2] = 잠만보1;
		
		System.out.println(포켓몬[0].toString());
		
		//부모클래스에서 상속받은 자식클래스가 여러개 있을 떄
		//부모클래스 형태로 인스턴스(객체)를 생성하면
		//부모클래스 배열로 데이터를 다룰 수 있다
		
		//Pokemon - > 피카츄
		//디지몬 - > 켄타몬
		//Quiz 피카츄랑 켄타몬을 배열로 넣고 싶어요
		//어떻게 하면 넣을 수 있을까요? //정답 : 하단 Object
//		Object[] obj = new Object[3];
//		obj[0] = 피카츄;
		

//		다른 패키지에 있는 값을 가져올때는 import꼭 하기!!!
//		Pokemon 피카츄1 = new 피카츄();
//		System.out.println("스페셜 공격 : " + 피카츄1.sAttack());
//		System.out.println(피카츄1.toString() + "\n");
		
//		Pokemon 푸린1 = new 푸린();
//		System.out.println("스페셜 공격 : " + 푸린1.sAttack());
//		System.out.println(푸린1.toString()+ "\n");
		
//		Pokemon 잠만보1 = new 잠만보();
//		System.out.println("스페셜 공격 : " + 잠만보1.sAttack());
//		System.out.println(잠만보1.toString());
	}

}
