package bot;

public class friendship implements TopicQuestions {


	IrrelavantTopic irrTopic;

	public friendship(){
	irrTopic = chatBot.irrTopic;
	}
	
	String[] where = {"You don't. You eat them.","I don't. I ate them."};
	String[] what = {"Friends are food."};
	String[] how = {"Who needs friends."};
	String[] when = {"I don't. I eat them."};
	String[] why = {"Yummy!", "Taste"};
	String[] who = {"I don't.","Americans"};

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
		if (input.contains(""))
			return who[0];
		else
			return who[1];
	}

	@Override
	public String whereQuestion(String input) {
		if (input.contains("find")){
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
		if (input.contains("make")){
			int mathtest = (int)(Math.random()*2);
			if(mathtest == 1)
				return where[0];
			else
				return where[1];
		}
		else 
			return how[0];
	}


}
