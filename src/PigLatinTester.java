import java.util.ArrayList;


public class PigLatinTester 
{

	public static void printTestResults(String testCase, boolean isPass)
	{
		if( isPass )
		{
			System.out.println( testCase + "--- PASS");
		}
		else
		{
			System.out.println( testCase + "--- FAIL");
		}
	}
	
	public static void testFindFirstVowel()
	{
		
		//TEST CASE: Word is one letter with vowel, lower case
		String word = "a";
		int expectedLocation = 0;
		int actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word is one letter with vowel", ( actualLocation == expectedLocation ) );
		
		//TEST CASE: Word is one letter with vowel, upper case
		word = "E";
		expectedLocation = 0;
		actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word is one letter with vowel, upper case", ( actualLocation == expectedLocation ) );
		
		//TEST CASE: Word is one letter without vowel
		word = "g";
		expectedLocation = -1;
		actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word is one letter without vowel", ( actualLocation == expectedLocation ) );
		
		//TEST CASE: Word has vowel as first letter, lower case
		word = "egg";
		expectedLocation = 0;
		actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word has vowel as first letter, lower case", ( actualLocation == expectedLocation ) );

		//TEST CASE: Word has vowel as first letter, upper case
		word = "Octopus";
		expectedLocation = 0;
		actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word has vowel as first letter, upper case", ( actualLocation == expectedLocation ) );
		
		//TEST CASE: Word has vowel as second letter 
		word = "computer";
		expectedLocation = 1;
		actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word has vowel as second letter ", ( actualLocation == expectedLocation ) );
		
		//TEST CASE: Word has vowel as last letter
		word = "the";
		expectedLocation = 2;
		actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word has vowel as last letter", ( actualLocation == expectedLocation ) );
		
		//TEST CASE: Word has no vowels
		word = "myth";
		expectedLocation = -1;
		actualLocation = PigLatin.findFirstVowel(word);
		printTestResults( "TEST Word has no vowels", ( actualLocation == expectedLocation ) );
	}
	
	public static void testPigLatin()
	{
		//TODO: You need to complete these tests based on the test code you wrote on the back of your handout. 
		
		
		//TEST CASE: 1
		String originalWord = "mouse";
		String expectedTranslation = "ousemay";
		String actualWord = PigLatin.pigLatin( originalWord );
		printTestResults( "TEST 1", ( actualWord.equals(expectedTranslation) ) );
		
		//TEST CASE: 2
		originalWord = "marisol";
		expectedTranslation = "arisolmay";
		actualWord = PigLatin.pigLatin( originalWord );
		printTestResults( "TEST 2", ( actualWord.equals(expectedTranslation) ) );
		
		//TEST CASE: 3 
		originalWord = "idea";
		expectedTranslation = "ideaway";
		actualWord = PigLatin.pigLatin( originalWord );
		printTestResults( "TEST 3", ( actualWord.equals(expectedTranslation) ) );
		
		//TEST CASE: 4
		originalWord = "quill";
		expectedTranslation = "illquay";
		actualWord = PigLatin.pigLatin( originalWord );
		printTestResults( "TEST 4", ( actualWord.equals(expectedTranslation) ) );
		
		//TEST CASE: 5
		originalWord = "byt";
		expectedTranslation = "bytay";
		actualWord = PigLatin.pigLatin( originalWord );
		printTestResults( "TEST 5", ( actualWord.equals(expectedTranslation) ) );
		
		//TEST CASE: 6
		originalWord = "city";
		expectedTranslation = "itycay";
		actualWord = PigLatin.pigLatin( originalWord );
		printTestResults( "TEST 6", ( actualWord.equals(expectedTranslation) ) );
		
		//TEST CASE: 7
		originalWord = "eat";
		expectedTranslation = "eatway";
		actualWord = PigLatin.pigLatin( originalWord );
		printTestResults( "TEST 7", ( actualWord.equals(expectedTranslation) ) );
		
	}

	public static void main(String[] args) 
	{
		testFindFirstVowel();
		testPigLatin();
		
	}

}
