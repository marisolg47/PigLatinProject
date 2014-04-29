import java.util.*;

public class PigLatin 
{
	//precondition: sWord is a valid String of length greater than 0.
	//postcondition: returns the position of the first vowel in sWord.  
	//	If there are no vowels, returns -1
	public static int findFirstVowel(String sWord)
	{
		//INSERT CODE HERE TO FIND FIRST VOWEL IN GIVEN STRING
		sWord=sWord.toLowerCase();//this turns the word into lowercase.
	for (int i=0; i<sWord.length();i++)//The purpose for this loop is to find the first vowel of the word
	{	
		String vowel=sWord.substring(i,i+1);//
         
		if (vowel.equals("a") || vowel.equals("e")||vowel.equals("i")||vowel.equals("o")||vowel.equals("u"))
		{
			return i;//this if statement checks if the string is a vowel
			//If the first letter is a vowel it will return 0, if there is no vowel it will return -1
			//and if the first word is not a vowel then it will return a number greater than one.
		}
		
	}
	
	return -1;
	}

	//precondition: sWord is a valid String of length greater than 0
	//postcondition: returns the pig latin equivalent of sWord
	public static String pigLatin(String sWord)
	{
		//INSERT CODE HERE TO IMPLEMENT THE FOUR RULES OF PIG LATIN
		
		if(findFirstVowel(sWord) == -1)//<--this means that there are no vowels in the word!
		{
			return sWord + "ay";//rule number one
		}
		else if (findFirstVowel(sWord)==0)//<--This means that the first letter is a vowel
		{
		return sWord+"way";// so if it is a vowel the it just adds "way"
		}
		else if (findFirstVowel(sWord)>0)//this checks that the first letter is a consonant 
		{
			 
				String vowquWord=sWord.substring(2,sWord.length());//this is for rule 3
				String quPhrase=sWord.substring(0,2);//this is for rule 3--the qu part
				int i=findFirstVowel(sWord);//<--this takes information from method findFirstVowel and uses i
				String conFirst=sWord.substring(0,i);//this finds the consonants in the beginning
				String theRest=sWord.substring(i,sWord.length());//this is the rest of the word not including the consonants
				
				
				if (quPhrase.equals("qu"))//if phrase is "qu" the add quPhrase to the end and add "ay"
				{
					return vowquWord+quPhrase+"ay";
				}
				else //anything else add the rest of the word+ the consonants+ "ay"
				{
					return theRest+conFirst+"ay";
				}
			
		}
			   
		      
				
		
	
			return "ERROR!";
	}

	public static void main(String[] args) 
	{
		//Here, the user interaction code is already written for you
		Scanner s = new Scanner(System.in);
		System.out.print("Enter word to translate: ");

		//This while loop allows the user to continuously enter words without re-starting the program 
		while(s.hasNext())
		{
			//The translated word/line is printed for the user
			String line = s.nextLine().trim();
			int space = line.indexOf(" ");
			
			//For input with multiple words, this loop prints out every word of the line translated
			while( space != -1 )
			{
				System.out.print(pigLatin(line.substring(0,space)) + " ");
				line = line.substring(space+1);
				space = line.indexOf(" ");
			}
			//Prints the last (or only) word translated
			System.out.print(pigLatin(line) + " ");
			
			//Asks the user for new input
			System.out.print("\nEnter next word to translate: ");
		}
	}
}