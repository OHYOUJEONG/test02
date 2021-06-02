package Game;

public class GameDummy implements IGame{

	@Override
	public void makeRandom() {
			//nothing , 아무런일도 일어나지 않습니다.
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
