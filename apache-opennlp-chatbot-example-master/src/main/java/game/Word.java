package game;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

//Handles the selection of words, obfuscating the word and displaying the current letters

public class Word 
{
	String chosenWord;
	char[] letters;
	char[] currentLetters;
	char[] wrongLetters;
	int wrongLettersCount = 0;

	Word(BufferedReader wordList)
	{
		//add all the words from the wordList into an ArrayList
		ArrayList<String> words = new ArrayList<String>();
		String word = null;
		try 
		{
			word = wordList.readLine();
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}

		while (word != null) 
		{
		    words.add(word);
		    try 
		    {
				word = wordList.readLine();
			} 
		    catch (IOException e) 
		    {
				e.printStackTrace();
			}
		}
		
		//choose a random word from the ArrayList and obfuscate it
		Random r = new Random();
		String chosenWord = words.get(r.nextInt(words.size()));
		letters = chosenWord.toCharArray();
		currentLetters = new char[letters.length];
		obfuscate(letters);
		System.out.println("Here's your word Try it out");
		System.out.println(currentLetters);
	}

	public char[] EnterEle(char[] letters, int[] rand)
	{
		char[] temp = new char[letters.length];
		for (int i = 0; i < letters.length; i++) {
			if (!Character.isDigit(letters[i]) && !Character.isLetter(letters[i]))
			{
				temp[i] = letters[i];
				continue;
			}
			temp[i] = '_';
			for(int ele: rand)
			{
				temp[ele] = letters[ele];
			}
		}
		return temp;
	}

	//make an char array of the same length as the word and fill it with blanks
	public void obfuscate(char[] letters)
	{
		Random r = new Random();
		int count = 0;
		int tempran = 0;
		if(letters.length<20)
		{
			int[] rand = new int[3];
			while(count<3)
			{
				tempran = r.nextInt(letters.length);
				rand[count] = tempran;
				count++;
			}
			currentLetters = EnterEle(letters, rand);

		}
		else if (letters.length>=20 && letters.length<30)
		{
			int[] rand = new int[5];
			while(count<5)
			{
				tempran = r.nextInt(letters.length);
				rand[count] = tempran;
				count++;
			}
			currentLetters = EnterEle(letters, rand);
		}
		else
		{
			int[] rand = new int[7];
			while(count<7)
			{
				tempran = r.nextInt(letters.length);
				rand[count] = tempran;
				count++;
			}
			currentLetters = EnterEle(letters, rand);
		}
	}
	
	//show the final answer
	public void reveal() 
	{
		System.out.println("The word is " + new String(letters));		
	}

	//return true if the input letter is in the word
	public boolean compare(String input) 
	{
		char[] inputChar = input.toCharArray();
		boolean correctLetter = false;
		for (int i = 0; i < letters.length; i++)
		{
			if (Character.toLowerCase(inputChar[0]) == Character.toLowerCase(letters[i]))
			{
				currentLetters[i] = inputChar[0];
				correctLetter = true;
			}	
		}
		if(correctLetter)
			System.out.println("The letter exits, guess another!");
		
		return correctLetter;
	}

	public void display() 
	{
		System.out.println(currentLetters);
	}
	public void winCheck() 
	{
		boolean flag = true;
		for(char ele: currentLetters)
		{
			if(ele == '_')
				flag = false;
		}
		if(flag)
			Game.win();		
	}
}
