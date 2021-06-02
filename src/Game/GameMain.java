package Game;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
	
		//GameDummy gm = new GameDummy();
		PlusGame gm = new PlusGame();
		
		gm.makeRandom(); //자동으로 난수가 생성이 됩니다.
		System.out.println(gm.getQuizMsg()); //문제가 출제됩니다.
		System.out.print("정답을 입력하세요 >> ");
		answer = sc.nextInt();
		
		System.out.println(gm.checkAnswer(answer)); //5를입력하면 현재는false가 나오게 되어있음

//		while(true) {
//			System.out.print("1번문제 >> " + gm.getQuizMsg() + " ");
//			int input = sc.nextInt();
//
//		}//while end
		
		
		
		
			
		}
		
		
	}


