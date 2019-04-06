package bot;

import java.util.Scanner;

public class food extends chatBot implements TopicQuestions {
	
	IrrelavantTopic irrTopic;
	
	public food(){
		 irrTopic = chatBot.irrTopic;
		}
	
	Scanner in = new Scanner(System.in);
	
	
	String[] what = {"Meat, like human", "Human, just like you", "Bubble Tea", "It's delisious"};
	String[] where = {"In my cave", "In Taiwan"};
	String[] who = {"Sometimes with myself", "Sometimes with other dinosaurs", "by myself", "The owner."};
	String[] how = {"four times", "It's so delicious", "By my hand", "It's a combination of tea and milk and tapioca balls.", "I like it half sweet."};
	String[] why = {"I need to eat.", "Because you look delicious."};
	String[] when = {"During luchtime", "Durig dinner time.", "Perhaps during breakfest time.", "Two days ago.", "When I am hungry."};		

	
	@Override
	public String runTopic(String input) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		if (input.contains("with")){
		int mathtest = (int)(Math.random()*2);
			if(mathtest == 1)
				return who[0];
			else
				return who[1];
		}
			else if(input.contains("cook")){
				return who[2];
			}else if(input.contains("make")){
				return who[3];
			}
		
		return "";
		
	}



	@Override
	public String whatQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat")){
			int mathtest = (int)(Math.random()*2);
				if(mathtest == 1)
					return what[0];
				else
					return what[1];
			}
		else if(input.contains("drink")){
			return what[2];
		}
		else if(input.contains("about")){
			return what[3];
		}
		return "";
	}



	@Override
	public String whereQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat")){
			return where[0];		
		}
		else if (input.contains("bubble tea") && input.contains("invent")){
			return where[1];
		}return "";
	}



	@Override
	public String whenQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat") && input.contains("lunch")){
			return when[0];
		}
		else if (input.contains("eat") && input.contains("dinner")){
			return when[1];
		}
		else if (input.contains("eat") && input.contains("breakfast")){
			return when[2];
		}
		
		else if (input.contains("last") && input.contains("meal")){
			return when[3];
		}
		else if (input.contains("eat")){
			return when[4];
		}
		return "";
	}



	@Override
	public String whyQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("eat") && (input.contains("me")|| input.contains("human"))){
			return who[1];
		}
		else if (input.contains("eat")){
			return who[0];
		}
		return "";
	}



	@Override
	public String howQuestion(String input) {
		// TODO Auto-generated method stub
		if (input.contains("about")){
			return how[1];
		} else if (input.contains("many") && input.contains("meal") && (input.contains("eat"))){
			return how[0];
		} else if (input.contains("do") && input.contains("eat")){
			return how[2];
		} else if (input.contains("bubble tea") && input.contains("made")){
			return how[3];
		} else if (input.contains("do") && input.contains("like") && input.contains("bubble tea")){
			return how[4];
			
		}
		return "";
	}
}
