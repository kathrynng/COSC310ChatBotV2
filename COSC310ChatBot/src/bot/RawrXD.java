package bot;

import java.util.Scanner;

public class RawrXD extends chatBot{

	public static void main(String[] args) { //roar game class
		System.out.println("So, " + name + " do you really think you can out Roar me!"); //dialogue
		System.out.println("Well Challenge accepted! Goodluck!");
		System.out.println("If you wanna quit just tell me so!");
		roargrab();  //goes to roargrab
	}
	
	
	public static void roargrab() { //main method to grab users input then sort it
		System.out.println(".............");
		System.out.println("Let's hear that roar!");
		Scanner roar = new Scanner(System.in);
		System.out.print("> ");
		String yourroar = roar.nextLine();
		String[] sentencecheck = yourroar.split("\\s+"); //splitting it up to see if the user is saying something else
		if (sentencecheck.length > 1) { //if a sentence is detected its not a roar, throw and see if they are trying to quit
			for(int i = 0; i < sentencecheck.length; i++) { //for loop to check every part of the sentence to see if you typed that you want to quit
				switch(sentencecheck[i]) { //then throws you to very start if you decide not to.
				case "quit":	case "stop":	case "end": 	case "leave":	case "cease": //improved efficency
					System.out.println("Maybe we can try again later?");
					chatBot.inputfield();
					break;
				default: 
					break;
				}
			}
			notaroar(); //go to the notaroar method
		}
		else if (sentencecheck.length == 0) { //this is if user just hits enter. or doesn't input anything
			System.out.println("I didn't hear anything. ");
			roargrab();
		}
		else {
			switch (yourroar) { //switch case to see if you typed quit or stop. if not goes into the test
			case "quit":	case "stop":	case "end": 	case "leave":	case "cease":
				System.out.println("Maybe we can try again later?");
				chatBot.inputfield();
				break;
			default:
				int size = yourroar.length(); //checking length then throwing to the tester.
				roartest(size);
			}

		}
		roar.close();
	}

	
	public static void notaroar() { //this is just telling you not to use sentences, but first checks to see if you tried to quit
		System.out.println("Uhm last i checked Roars aren't sentences. If you're not up for this just tell me you want to quit.");
		roargrab();
	}
	
	
	public static void roartest(int size) { //this is just the details as to how well of a roar you make. 
		
		if ((size >= 0) && (size < 10)){
			System.out.println("I'm sorry, I couldn't hear you. Please don't mumble. What do you say? Try again?");
			roargrab(); //this just throws a loop. comparing size to my preset, then yelling at you.
		}
		else if ((size >= 10) && (size < 20)){
			System.out.println("Oh you actually know how to talk. Not good enough, Try again?");
			roargrab();
		}
		else if ((size >= 20) && (size < 30)){
			System.out.println("Talking will get you nowhere...");
			roargrab();
		}
		else if ((size >= 30) && (size < 40)){
			System.out.println("I'm not sure what that was but I can guaruntee that it was not a roar.");
			roargrab();
		}
		else if ((size >= 40) && (size < 50)){
			System.out.println("You wouldn't believe the amount of muscles it takes to shake my head at that... attempt.");
			roargrab();
		}
		else if ((size >= 50) && (size < 60)){
			System.out.println("Oh! That was actually above talking volume.");
			roargrab();
		}
		else if ((size >= 60) && (size < 70)){
			System.out.println("Thats cute, I think I was that loud when I was born.");
			roargrab();
		}
		else if ((size >= 70) && (size < 80)){
			System.out.println("You sound like a small dinosaur, getting closer.");
			roargrab();
		}
		else if ((size >= 80) && (size < 90)){
			System.out.println("Good, but not good enough! Keep Trying.");
			roargrab();
		}
		else if ((size >= 90) && (size < 100)){
			System.out.println("Careful! Someone might mistake you for a Dinosaur");
			roargrab();
		}
		else if ((size >= 100) && (size < 125)){
			System.out.println("You're almost there! just try a little bit harder okay!");
			roargrab();
		}
		else if ((size >= 125) && (size < 256)){
			System.out.println("Now THAT was a Roar, Excellent Job! Do you still want to roar with me?");
			roargrab();
		}
		else if (size >= 256){
			System.out.println("Y-y-you don't have to shout at me o-okay!"); //an easter egg
			roargrab();
		}
	}

}
