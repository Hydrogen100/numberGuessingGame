import java.util.Scanner;
public class numberGuessingGameCourse3 {
public static void main(String args[]){
	//give user intro of what this program does
	//say when 0 is returned, it means the number exists, but at the wrong place
	//say when 1 is returned, it means the number exists and is at the right place
	//ask user to insert a string of 4 numbers using digits from 1-9 through scanners
	//split each number in the string into a char variable and do comparisons
	//now ask user for guesses
	//return 0s and 1s accordingly
	System.out.println("Hello, this program is a number guessing game based on MasterMind.");
	System.out.println("The goal of the game is to guess the numbers in the correct order");
	System.out.println("First, input four numbers with no spaces in between from 1-9");
	System.out.println("Then, proceed with guessing, and 0s and 1s will be returned");
	System.out.println("A 0 means the number exists in the code, but is at the wrong location");
	System.out.println("On the other hand, a 1 means the number exists in the code, and is at the right location");
	System.out.println("Please input your four numbers now");
	Scanner input=new Scanner(System.in);
	//reject the input if it is not 4 numbers
	//reject if the input contains a 0
	String fourNumbers=input.next();
	char one=fourNumbers.charAt(0);
	char two=fourNumbers.charAt(1);
	char three=fourNumbers.charAt(2);
	char four=fourNumbers.charAt(3);
	//ask user to start guessing
	//maybe count the number of tries required?
	System.out.println("Please proceed with guessing now");
	boolean gameLose=true;
	while(gameLose){
		input.next();
		
	}
	//use while function to take in four numbers over and over
	//incorporate a system where first number compares with first guess, second with second...etc.
	//if first comparison is equivalent, then return a 1
	//if second-fourth comparison is equivalent, then return 0
	//when either 1 or 0 is returned, immediately cut off comparisons in case of doubles
	//last check of number of 1s; if there are four 1s, then stop game and congratulate user
	
	//use objects and assign each number to them, also give each object a (1 to 4) comparison value for comparisons
	//check number with first to fourth number, and assign 0 if exists but wrong position
	//if the comparison value matches the position of the number and it's the same, override 0 with 1 
	//create boolean isNumberTrue=false and if 1 is returned, then change it to true and skip comparisons 
	//(change back when loop repeats again)
}
}
