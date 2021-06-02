package Game;

import java.util.Random;

public class PlusGame implements IGame {
	
	
	
	int a,b;

	@Override
	public void makeRandom() {
		Random rd = new Random();
		Random rd2 = new Random();
		a = rd.nextInt(9)+1;
		b = rd2.nextInt(9)+1;
	}

	@Override
	public String getQuizMsg() {
		return a + "+" + b + " = ";
	}

	@Override
	public boolean checkAnswer(int answer) {
		if(answer == a+b) {
			return true;
		}else {
			return false;
		}
	}

}
