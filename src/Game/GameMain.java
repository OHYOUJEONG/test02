package Game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
	
		//GameDummy gm = new GameDummy();
		PlusGame gm = new PlusGame();
		
		gm.makeRandom(); //�ڵ����� ������ ������ �˴ϴ�.
		System.out.println(gm.getQuizMsg()); //������ �����˴ϴ�.
		System.out.print("������ �Է��ϼ��� >> ");
		answer = sc.nextInt();
		
		System.out.println(gm.checkAnswer(answer)); //5���Է��ϸ� �����false�� ������ �Ǿ�����

//		while(true) {
//			System.out.print("1������ >> " + gm.getQuizMsg() + " ");
//			int input = sc.nextInt();
//
//		}//while end
		
		
		
		
			
		}
		
		
	}


