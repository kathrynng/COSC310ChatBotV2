package bot;

public class capitalism implements TopicQuestions {

	IrrelavantTopic irrTopic;

	public capitalism(){
	irrTopic = chatBot.irrTopic;
	}
	
	String[] where = {"When you are a victim of consumerism.","Anywhere money is in control."};
	String[] what = {"An economic and political system in which a country's trade and industry are controlled by private owners for profit, rather than by the state."};
	String[] how = {"Stop spending so much money!", "I may be a dinosaur but humans sure are a wreck."};
	String[] when = {"Every day's a good day to get rid of capitalism"};
	String[] why = {"My brothers and sisters have fallen to the hands of money.", "Have you seen Jurr*sic P*rk? We are being used to make profit."};
	String[] who = {"Karl Marx","Americans"};

	@Override
	public String runTopic(String input) {
		String wHquestion = irrTopic.getwHquestion();
		switch (wHquestion) {
		case "what": 
			return whatQuestion(input);
		case "where":
			return whereQuestion(input);
		case "when":
			return whenQuestion(input);
		case "why":
			return whyQuestion(input);
		case "how":
			return howQuestion(input);
		case "who":
			return whoQuestion(input);
		}
		return "";
	}

	@Override
	public String whoQuestion(String input) {
		if (input.contains("worship"))
			return who[0];
		else
			return who[1];
	}

	@Override
	public String whereQuestion(String input) {
		if (input.contains("found")){
			return where[1];
		}
		else
			return where[0];
		
	}

	@Override
	public String whatQuestion(String input) {
		return what[0];
	}

	@Override
	public String whenQuestion(String input) {
		return when[0];
	}

	@Override
	public String whyQuestion(String input) {
		int mathtest = (int)(Math.random()*2);
		if(mathtest == 1)
			return why[0];
		else
			return why[1];
	
	}

	@Override
	public String howQuestion(String input) {
		if (input.contains("stop")){
			return how[0];
		}
		else 
			return how[1];
	}

}
