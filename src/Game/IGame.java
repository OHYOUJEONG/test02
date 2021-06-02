package Game;

public interface IGame {
	
	public abstract void makeRandom();
	public abstract String getQuizMsg();
	public abstract boolean checkAnswer(int answer);

}
