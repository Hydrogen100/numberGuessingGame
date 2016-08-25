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
	System.out.println("Please input your four numbers now");
	Scanner input=new Scanner(System.in);
    //reject the input if it is not 4 numbers
//REJECT IF THE INPUT CONTAINS a 0
	boolean wrongString=true;
	String fourNumbers="a";
	char[] answerArray=new char[4];
	while(wrongString){
	fourNumbers=input.next();
	answerArray[0]=fourNumbers.charAt(0);
	answerArray[1]=fourNumbers.charAt(1);
	answerArray[2]=fourNumbers.charAt(2);
	answerArray[3]=fourNumbers.charAt(3);
	int countForZero=0;
	for(int a=0;a<4;a++){
		if((answerArray[a])!='0'){
			countForZero++;
    //something wrong here, countForZero equals four even with zeros in answer
		}
	}
	if(fourNumbers.length()==4&&countForZero==4){
		wrongString=false;
	}else{
	System.out.println("Please input again");
	}
	
	}
	
	
	//ask user to start guessing
    //maybe count the number of tries required?
	System.out.println("Please proceed with guessing now");
	boolean gameLose=true;
	numberGuessed[] guessArray=new numberGuessed[4];
	int tries=1;
	while(gameLose){
		boolean wrongString2=true;
		while(wrongString2){
			String guessedNumber=input.next();
			int countForZero=0;
			numberGuessed guessOne=new numberGuessed(0);
			guessOne.guess=guessedNumber.charAt(guessOne.position);
			numberGuessed guessTwo=new numberGuessed(1);
			guessTwo.guess=guessedNumber.charAt(guessTwo.position);
			numberGuessed guessThree=new numberGuessed(2);
			guessThree.guess=guessedNumber.charAt(guessThree.position);
			numberGuessed guessFour=new numberGuessed(3);
			guessFour.guess=guessedNumber.charAt(guessFour.position);
			
			guessArray[0]=guessOne;
			guessArray[1]=guessTwo;
			guessArray[2]=guessThree;
			guessArray[3]=guessFour;
			for(int a=0;a<4;a++){
				if(guessArray[a].guess!='0'){
					countForZero++;
				}
			}
			if(guessedNumber.length()==4&&countForZero==4){
				wrongString2=false;
			}else{
				System.out.println("Please input again");
			}
		}
		
		//check from one to four
		
//SO FAR EVERYTHING ABOVE IS RIGHT
		
		int countCorrectSpot=0;
		int countCorrectWrongSpot=0;
		
		for(int j=0;j<4;j++){
			//use one of the four numbers from ACTUAL answer for comparison
		int guessArrayIndex=guessArray[j].position;
		//System.out.println(guessArrayIndex);
		//String returnClue="a";
		
		for(int i=0; i<4; i++){
			//run through all 4 guesses for checks
			
			if(guessArrayIndex==4){
				guessArrayIndex=guessArrayIndex-4;
			}
			if(answerArray[j]==guessArray[guessArrayIndex].guess){
				if(i==0){
					countCorrectSpot+=1;
					//System.out.println(returnClue);
					//return 1 to string;
					i=5;
				}else{
					countCorrectWrongSpot+=1;
					//return 0 to string;
					i=5;
				}
			}
			guessArrayIndex++;
			
		}
		
	}
		if(countCorrectSpot==4){
			gameLose=false;
			System.out.println("Congratulations, you won the game! Completed with "+tries+" tries");
		}else{
			tries++;
			System.out.println("Number in correct spots: "+countCorrectSpot);
			System.out.println("Number of correct guesses but in wrong spots: "+ countCorrectWrongSpot);
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//use while function to take in four numbers over and over
	//use objects and assign each number to them, also give each object a (1 to 4) comparison value for comparisons
		//check number with first to fourth number, and assign 0 if exists but wrong position
		//if the comparison value matches the position of the number and it's the same, override 0 with 1 
		//create boolean isNumberTrue=false and if 1 is returned, then change it to true and skip comparisons 
		//(change back when loop repeats again)
	//last check of number of 1s; if there are four 1s, then stop game and congratulate user
	
	
}

	//framework
	//insert start value of actual number
		//loop from start value to 3 for guess, then back
		//when start value=current value, end comparisons

	
	
	//details
	//check from zero to three
			//go through, give 0 if match in wrong place
			//right place, give 1 and END comparisons (or make sure 1 does not got overwritten)
	
	

}
