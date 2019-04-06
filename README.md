# COSC310ChatBot VERSION 2 - Assignment 3
#### update by Kathryn Ng
(Members: Noah Arndt, Aidan Davies, Kathryn Ng, Yue Wang, Eric Yang)

## What is Dino-Bot?
Dino-Bot is a conversation robot that you can talk to ( just like your friend !). We created this chatbot with the idea in mind of conversing with a prehistoric reptile.
Dino-Bot can talk about few different things ( see instructions below ). 

## What has been updated?
Dino-Bot now has a better looking (still ancient?) GUI! Additionally, his database is now updated with more information as he has started going to school! Other than that, talking to him about things he might not know about will prompt you to ask him something else (in 5 new different ways!).

## How to use use our Dino-Bot:
1. Run the command line interface of your preference (eg. command prompt).
2. Redirect the directory to the location of the file.
3. On the console, type: `java -jar dinobot.jar`

When the main image has been loaded,  Dino-bot (Tee-Tee) will ask you to input your name to ensure we can use it when you chat.
You may either input "help" if you want to know what can Dino-Bot can talking about or just jump right into your conversation.
*- Roaring Contest:*
	If your input contain "roar", you may enter or pass to get into roaring contest. 
	When you are in roaring contest, you may roar to the Dino-Bot (input "roar" as many time as you want)and Dino-Bot will give you a respond. You may also type in a sentence and see how Tee-Tee is going to respond to you :) . 
	If you wish to quit, you may input "quit" to exit roaring contest.

*- Collection:*
	Tee-Tee love to collects rocks and bones. Go talk to Tee-Tee about the collection. 
  
	You may ask: What is your favorite rock? , Why no plants?

*- Food:* 
	You may asking some question about food to the Dino-Bot. 
  
	For example, What do you like to eat , How do you like your bubble tea? or when will you eat me?   

*- Lord of the Rings:* 
	Tee-Tee	loves Lord of the Rings. Go ask Tee-Tee some questions about LOTR.
  
	Sample inputs: What is your favorite LOTR location

*- Personal Q & A:* 
	Want to get to know more about Tee-Tee? Ask Tee-Tee some personal questions.
  
	Example: How old are you?, Where am I? 
  
  > NEW TOPICS!
  
 *- School:* 
  Tee-Tee is now getting a degree. You can ask him things about school!
  
	Example: What school do you go to?, How often do you study? 
  
   *- Capitalism:* 
  Higher education comes with a price. Ask Tee-Tee what he thinks about Capitalism!
  
  Example: What is capitalism? Who is Karl? 
  
   *- Friendship:* 
  It's hard to make new friends sometimes. Dinosaurs live in packs so it should be easy for them. (Maybe except Tee-Tee.)
 
	Example: How do you make friends? Who are your friends? 
	
Friendly reminder, Tee-Tee does not like swear words. However, you may try and see what will happen.  

## About our code:
We have a main chatbot class, then we have other (topic) classes that implement the interface. All our topic classes are extended from the main chatbot class. When the input ( user's input) first receive, IrrelaventTipic class will process the input and assign the input to the related topic classes and also passes the input to the topic class. In each topic class, it will process the input ( user's input ) and find the reasonable respond to answer (print) the user. 

### Details of New Features:
- GUI:

  The new Window system, evolved from the jar file console system, has improved the communication and visuality of conversations between Tee-Tee and the user. Tee-Tee, an educated dinobot, has a Serif font as his "text-persona". The user uses the font-face "Papyrus" as a Mummy is the closest civilized human being Dinosaurs are nearest to in terms of eras.
  Having two different fonts and colors for both the user and the bot improved the separation between both agents.
  
- New Topics (x 3)

  School, Capitalism and Friendships are what all dinosaurs experience as they acheive a higher-education. 
  Having those topics improve the ability for the bot to "relate" to human beings (especially University Students).
  
- Off-topic Replies

  At first: Tee-Tee only replies with a 
  ```
  "Sorry! I don't think I understand that."
  ```
  but now Tee-Tee can reply in 5 new different "I don't understand"s, and even prompt the user for topics the bot knows about!
  As the bot is able to do that it creates the conversation more varied rather than having a singular sentence.
  
- NIGHTMODE

  Nightmode / darkmode is very popular among applications, to make it trendy / better on the eyes etc. Although nightmode should be under the GUI, it is popular enough for it to be it's own "function".
