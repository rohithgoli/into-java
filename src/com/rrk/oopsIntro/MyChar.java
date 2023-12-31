package com.rrk.oopsIntro;

public class MyChar {
	
	private char letter;
	
	public MyChar(char letter) {
		this.letter = letter;
	}
	
	public boolean isVowel() {
		switch(this.letter) {
			case 'a':
				return true;
			case 'A':
				return true;
			case 'e':
				return true;
			case 'E':
				return true;
			case 'i':
				return true;
			case 'I':
				return true;
			case 'O':
				return true;
			case 'o':
				return true;
			case 'u':
				return true;
			case 'U':
				return true;
			default:
				return false;
		}
	}
	
	public boolean isConsonant() {
		if(isAlphabet() && !isVowel())
			return true;
		return false;
	}
	
	public boolean isDigit() {
		int asciiValueOfLetter = (int) letter;
		if (asciiValueOfLetter >= 48 && asciiValueOfLetter <= 57) {
			return true;
		}
		return false;
	}
	
	public boolean isAlphabet() {
		int asciiValueOfLetter = (int) letter;
		if(asciiValueOfLetter >= 65 && asciiValueOfLetter <= 90) {
			return true;
		} else if (asciiValueOfLetter >= 97 && asciiValueOfLetter <= 122) {
			return true;
		}
		return false;
	}
	
	public static void printLowerCaseAlphabets() {
		for(int value=97; value <= 122; value++) {
			System.out.println((char) value);
		}
	}
	
	public static void printUpperCaseAlphabets() {
		for(char value='A'; value <= 'Z'; value++) {
			System.out.println(value);
		}
	}
}
