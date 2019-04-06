package bot;

public interface TopicQuestions {
	public abstract String runTopic(String input);
	/***
	runTopic should will take in the String input,
	which will be the words /who / what/ where / when / why / how
	and run the respective question method
	**/
	public abstract String whoQuestion(String input);
	public abstract String whatQuestion(String input);
	public abstract String whereQuestion(String input);
	public abstract String whenQuestion(String input);
	public abstract String whyQuestion(String input);
	public abstract String howQuestion(String input);
	
}
