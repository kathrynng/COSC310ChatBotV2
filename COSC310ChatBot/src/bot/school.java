package bot;

public class school implements TopicQuestions {
	IrrelavantTopic irrTopic;

	public school(){
	irrTopic = chatBot.irrTopic;
	}
	
	String[] where = {"I study in UBCO", "Kelowna in the Okanagan Valley"};
	String[] what = {"I study in UBCO", "I am studying anthropology", "I really like taking that one course on dinosaurs!"};
	String[] how = {"I study by sleeping", "I go to school by walking", "My class is usually a full day long."};
	String[] when = {"I only have one course, it's at 10 am on Mondays", "Not very often"};
	String[] why = {"To get an education!", "I may be a T-rex but I want to expand my brain"};

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
		}
		return "";
	}

	@Override
	public String whoQuestion(String input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String whereQuestion(String input) {
		if (input.contains("located")){
			return where[1];
		}
		else
			return where[0];
		
	}

	@Override
	public String whatQuestion(String input) {
		if (input.contains("at")){
			return what[0];
		}
		else if(input.contains("major")||input.contains("field")){
			return what[1];
		}else if(input.contains("favorite") && input.contains("course")){
			return what[3];
		}
			
		return "";
	}

	@Override
	public String whenQuestion(String input) {
		if (input.contains("often")){
			return when[1];
		}
		else
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
		if (input.contains("get") && input.contains("to")){
			return how[1];
		}
		else if(input.contains("long"))
			return how[2];			
		return how[0];
	}

}
