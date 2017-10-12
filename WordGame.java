package hw2;


public abstract class WordGame {
	public String[] dictionaryWords;		//stores words read from the dictionary
	public String gameWord;  				//word picked up from the dictionary for the puzzle 
	public StringBuilder userInputs = new StringBuilder(); //stores all guesses entered by the user
	public String message;					//message to be printed on console after each user interaction
	public static final int MAX_TRIALS = 10; 
	public int trialCount=0;				//incremented everytime user enters a valid guess
	public boolean won = false;			//set to true when user input matches the gameWord
	public String clueWord;				//clue shown to the user on console
	public double score;					//updated by calcScore() 
	public int hit; //number of correct guesses made by player
	public int miss; //number of wrong guesses made by player

	WordGame() {
		dictionaryWords = readFile();
		setupWords();
	}

	//readfile() opens the file and reads it into StringBuffer
	//returns an array of String by splitting the words on new line
	public String[] readFile() {
		//enter code here
		return null;
	}

	//pickWord() picks a word randomly from within the dictionaryWords array
	//It returns the word that has at least 4 or more characters in it.
	public void pickGameWord(){
		//enter code here
	}


	public abstract int nextTry(String input);

	public abstract double calcScore();

	public abstract void setupWords();

}
