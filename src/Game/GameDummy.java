package Game;

public class GameDummy implements IGame{

	@Override
	public void makeRandom() {
			//nothing , �ƹ����ϵ� �Ͼ�� �ʽ��ϴ�.
	}

	@Override
	public String getQuizMsg() {
		return "2+3=";
	}

	@Override
	public boolean checkAnswer(int answer) {
		return false;
	}

	
	
	
	
}
