package bot;

import java.util.Scanner;

@SuppressWarnings("resource")
public class collection{
static int mathtest;
	public String runTopic(String input)  {
		// TODO Auto-generated method stub
		Scanner maininput = new Scanner(System.in);
		String userinput = input;
		
		//asking what favorite type of rocks
		if((userinput.contains("what")) && userinput.contains("favorite") && (userinput.contains("rock") || userinput.contains("rocks"))){
			return "I don't have a favorite rock. What is your favorite?";
		}
		//asking why no plants
		else if(userinput.contains("why") && ((userinput.contains("plant")) || userinput.contains("plants"))) {
			mathtest = (int)(Math.random()*2);
			if(mathtest == 1)
				return "Plants are too soft and break easily";
			else
				return "Plants get nasty really fast after picking them up";
		}
		//if you ask why he collects
		else if(userinput.contains("why")) {
			mathtest = (int)(Math.random()*5);
			if(mathtest == 0)
				return "I think the rocks are pretty";
			else if(mathtest == 1)
				return "I like how the bones look";
			else if(mathtest == 2)
				return "The bones make me seem way more intimidating, almost like I killed them myself";
			else if(mathtest == 3)
				return "It shows how far I have traveled";
			else 
				return "Sometimes I want a reminder of what I have done.";
		}
		//checking when they collection items
		else if(userinput.contains("when")) {
			mathtest = (int)(Math.random()*3);
			if(mathtest == 0)
				return "After eating I might collect the bones";
			if(mathtest == 1)
				return "I wonder around during the day to find things";
			else
				return "Definitely not at night, too hard to see things";
		}
		//asking who helps
		else if(userinput.contains("who")) {
			return "Just me, this is just my collection";
		}
		//checking least favorite bone
		else if((userinput.contains("what")) && (userinput.contains("least")) && userinput.contains("favorite") && (userinput.contains("bone") || userinput.contains("bones"))){
			mathtest = (int)(Math.random()*2);
			if(mathtest == 0)
				return "The raptor Bones, because they are brittle and hard to bring home.";
			else
				return "The raptor Bones, because they are hard to find and raptors can be mean.";
		}
		//checking favorite bone
		else if((userinput.contains("what")) && userinput.contains("favorite") && (userinput.contains("bone") || userinput.contains("bones"))){
			return "The Argentinosaurus, Because It is one of the biggest Dinosaur's I've seen";
		}
		//asking what kind of bones
		else if(userinput.contains("what") && ((userinput.contains("bones")) || userinput.contains("bone"))){
			mathtest = (int)(Math.random()*4);
			if(mathtest == 0)
				return "I have some raptor bones";
			else if (mathtest == 1)
				return "I have some Spinosaurus bones";
			else if (mathtest == 2)
				return "I have a few Argentinosaurus bones. It's HUGE!";
			else
				return "I have various random bones";
		}
		//asking what kind of rocks
		else if(userinput.contains("what") && (userinput.contains("rocks") || userinput.contains("rock"))) {
			mathtest = (int) (Math.random()*3);
			if (mathtest == 0) 
				return "I have some Volcanic rocks";
			else if (mathtest == 1)
				return "I have a few Geode and crystal rocks";
			else
				return "I have a few gem rocks.";  
		}
		//asking what kind of gems
		else if(userinput.contains("what") && ((userinput.contains("gem") || (userinput.contains("gems"))))){
			mathtest = (int)(Math.random()*2);
			if(mathtest == 0)
				return "I have emeralds!";
			else
				return "I have rubies!";
		}
				
		//asking what you have in general
		else if(userinput.contains("what")) {
			mathtest = (int) (Math.random()*3);
			if(mathtest == 0) { //multiple random for different responses for generic what
				return "I have rocks";
			}
			else if (mathtest == 1){
				return "I have bones";	
			}
			else {
				return "I do not have plants";
			}
		}
		//if they ask about how you got the rocks
		else if((userinput.contains("how")) && ((userinput.contains("rocks")) || userinput.contains("rock"))) {
			mathtest = (int) (Math.random()*2);
			if(mathtest == 0) {
				return "I just wander around and kick the rocks home or grab them with my teeth";
			}
			else if(mathtest == 1) {
				return "Sometimes I drop bigger rocks on smaller rocks to see what happens";
			}
		}
		//if they just ask a random general how
		else if(userinput.contains("how")) {
			mathtest = (int) (Math.random()*5);
			if(mathtest == 0) {
				return "I just wander around and kick the rocks home or grab them with my teeth";
			}
			else if(mathtest == 1) {
				return "Sometimes I drop bigger rocks on smaller rocks to see what happens";
			}
			else if (mathtest == 2) {
				return "I kill things for dinner and save the body for later";
			}
			else if(mathtest == 3) {
				return "I kill things and wait for others to eat it and collect the bones";
			}
			else {
				return "I wait for for other things to kill stuff and then grab the bones";
			}
		}
		//asking if it is dangerous
		else if(userinput.contains("dangerous")) {
			mathtest = (int) (Math.random()*4);
			if(mathtest == 0) {
				return "Rocks aren't really dangerous to grab and carry";
			}
			else if(mathtest == 1) {
				return "Bones can be dangerous, especially if I take them from someone else";
			}
			else if(mathtest == 2) {
				return "Yes Sometimes other dinosaurs chase after me thinking I have food";
			}
			else {
				return "Yes sometimes other dinosaurs think I am stealing their food";
			}
		}
		return "";
	}
	
	
	
	public static String favoritecheck(String fav) { //checks to see if the chatbot knows your stone, and if it does and its a birthstone will declare the month of it.
		switch (fav) {
		case "emerald":
			return "Your favorite is " + fav + " ? That's the May gemstone";
			 
		case "ruby":
			return "Your favorite is " + fav + " ? That's the July gemstone";
			 
		case "diamond":
			return "Your favorite is " + fav + " ? That's the April gemstone";
			 
		case "opal":
			return "Your favorite is " + fav + " ? That's the October gemstone";
			 
		case "garnet":
			return "Your favorite is " + fav + " ? That's the January gemstone";
			 
		case "topaz":
			return "Your favorite is " + fav + " ? That's the November gemstone";
			 
		case "sapphire":
			return "Your favorite is " + fav + " ? That's the September gemstone";
			 
		case "pearl":
			return "Your favorite is " + fav + " ? That's the June gemstone";
			 
		case "geode":
			return "Your favorite is " + fav + " ? That sounds like a good one!";
			 
		case "amythest":
			return "Your favorite is " + fav + " ? That's the February gemstone";
			 
		case "aquamarine":
			return "Your favorite is " + fav + " ? That's the March gemstone";
			 
		case "turquoise":
			return "Your favorite is " + fav + " ? That's the December gemstone";
			 
		case "onyx":
			return "Your favorite is " + fav + " ? That sounds like a good one!";
			 
		case "carnelian":
			return "Your favorite is " + fav + " ? That sounds like a good one!";
			 
		case "peridot":
			return "Your favorite is " + fav + " ? That's the August gemstone";
			 
		case "beryl":
			return "Your favorite is " + fav + " ? That sounds like a good one!";
			 
		case "tanzanite":
			return "Your favorite is " + fav + " ? That sounds like a good one!";
		default:
			return "Hmmmm I'm sorry I don't think I know what " + fav + " is. Sorry!";
		}
	}

}