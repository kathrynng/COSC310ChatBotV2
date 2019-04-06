package bot;
import java.lang.reflect.*;
import java.util.Scanner;
public class chatBot {

	static String name; 
	static String checkstring;
	public static IrrelavantTopic irrTopic;
	public static String toDisplay;
	
	public static void main(String args[]) {
		irrTopic = new IrrelavantTopic();
//		Loadingscrean.main(args); 
//		System.out.println("ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr");
//		System.out.println("Welcome to the Dino-Bot, Please Enter the name you would like to be called by.");
		Scanner mainscan = new Scanner(System.in);
		System.out.print("> ");
		name = mainscan.nextLine();
		System.out.println("Greetings " + name + ". My name is Tee-Tee the T-Rex!!");
		System.out.println("If you are curious type \"help\" to get a list of topics I will talk to you about!");
		//feel free to change later, just did this so i could access code from main area
//		inputfield();
		mainscan.close();

		
	}
	
	public static String welcome() {
		toDisplay= "";
		String welcome = "ROAr roar roooar roar rrrroooaaaarrr RoaaaaaaaaaaaaaaaAAArrArArAr! \nWelcome to the Dino-Bot, Please Enter the name you would like to be called by.";
		return welcome;
	}
	
	public static String processName (String name) {
		return "Greetings " + name + ". My name is Tee-Tee the T-Rex!!\nIf you are curious type \"help\" to get a list of topics I will talk to you about!";
	}
	
	public static String processText(String s) {
		irrTopic = new IrrelavantTopic();
		boolean continueConv;
		String startoption;
		
		startoption = s.toLowerCase(); //scanning an input
		continueConv = conversation(startoption);
		
		if (continueConv == false) {
			System.exit(0);
		}
		return toDisplay;
	}
	
	public static boolean conversation(String userIn) {
		try {
			toDisplay = processTopic(userIn);
			return true;
		} catch (SecurityException | IllegalArgumentException e) {
			// TODO Auto-generated catch block
			toDisplay = "Sorry! There seems to be an issue." + "\nPlease restart the program.";
			return false;
		}
	}
	
	//CHECKING THE TOPIC
		public static String processTopic(String top) { //grabs the topic, to save space this is used fo most topics
			//if(top.contains("roar")) //{
			if(top.equals("help")) {
				return helpMe();
			}
			else if(top.equals("about")) {
				return aboutMe();
			
			}
			//swear filter
			else if(top.equals("wingdings")||top.equals("century")) {
				return "Oh, so you want to talk like this?";
			}
			else if(top.contains("roar")){
				//uh
			}
			else if(top.contains("fuck") || top.contains("bitch") || top.contains("shit") || top.contains(" ass") || top.contains("fucking") || top.contains("motherfucker") || top.contains("damn")){
				return "Please do not swear at me!" +
				"\nIf you are going to be rude this conversation is over!";
				
			}
			else if (top.contains("nightmode")) {
				return "I'm sleepy!";
			}
			else {
				try {
					if (irrTopic.checkRelavancy(top)==true) 
						return irrTopic.topicReturn;
					else
						System.exit(0);
						return irrTopic.topicReturn;
				} catch (NoSuchMethodException | SecurityException | ClassNotFoundException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException | InstantiationException e) {
					e.printStackTrace();
				}
				
			}
			return "error";
		}
		
	
	//CHECKING THE TOPIC
//	public static void checktopic(String top) { //grabs the topic, to save space this is used fo most topics
//		Scanner topche = new Scanner(System.in);
//		if(top.contains("roar")) {
//			System.out.println("Sorry! My dino-speech is better than my english, did you want to have a roaring contest?"); //maybe you didn't mean to go here
//			String topicyesno = (topche.nextLine()).toLowerCase();
//			String[] topicsentence = topicyesno.split(" "); //splitting it up
//			for(int i = 0; i < topicsentence.length; i++){ //
//				String topgrabbed = topicsentence[i];
//				switch(topgrabbed){ //switch parsing string to see what happens
//				
//				case "yes": case "yup": case "okay": case "sure": case "ok": case "ye": case "yeah":
//					RawrXD.main(null); // plays roaring contest
//				case "no": case "nope": case "nah": case "never":
//					System.out.println("No? Okay then.");
//					inputfield(); //returns false to where it was called.
//					
//				default:
//					System.out.println("I still don't understand."); //default incase you spam the keyboard
//					
//				}
//				topche.close();
//				inputfield();
//			}
//		}
//		else if(top.equals("help")) {
//			helpMe();
//			return;
//		}
//		else if(top.equals("about")) {
//			aboutMe();
//			return;
//		}
//		//swear filter
//		else if(top.contains("fuck") || top.contains("bitch") || top.contains("shit") || top.contains("ass") || top.contains("fucking") || top.contains("motherfucker") || top.contains("damn")){
//			System.out.println("Please do not swear at me!");
////			thinking();
////			thinking(); //just giving spacing
//			System.out.println("If you are going to be rude this conversation is over!");
////			thinking();
////			thinking();//more spacing
////			thinking();
//			System.exit(0); //closing the program forcibly
//		}
//	}
	
	//helpMe prompts user with list of topics the bot is able to talk about.
	public static String helpMe() {
		return "Curious to know what I can talk about? Have a list \n" //prints list of topics
//		System.out.println(thinking());	  //************************************************
//		System.out.println(thinking());   //*ISSUE WITH THINKING METHOD OMITTED FOR TESTING*
//		System.out.println(thinking());   //************************************************
		+ "...........\n" //spacer
		+ "We can test how well your roar is!\n"			 	//Prompts roar contest
		+ "Or we can talk about food\n"					//Prompts food topic
		+"We can discuss my rock collection!\n"			//Prompts collection topic
		+"How about talking about Lord of The Rings?\n"		//Prompts Lord of The Rings topic
		+ "I'm in school right now so you can ask me about that!\n"
		+ "Hate capitalism? Me too!\n"
		+ "I really wish I knew how to make friends.\n"
		+"Or if you want to get to know me thats fine too!";	//Prompts general qna
//		+thinking());
		
	}
	
	public static String aboutMe() {
		return "My name is Tee-Tee and I am a Java jar program, " +
		"coded by Eric, Noah, Yue, Aidan and Kathryn - for their COSC 310 Assignment. \n" +
		"They hope you'll get the full experience of talking to an old dinosaur like me!\n";
	}
	
}
