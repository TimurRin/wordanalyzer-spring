package ru.moziev.job.blackhammer.wordanalyzer;

import java.util.HashMap;

public class WordAnalyzer {
	private final char letter;
	private final int count;

	public WordAnalyzer(char letter, int count) {
		this.letter = Character.toLowerCase(letter);
		this.count = count;
	}

	public char getLetter() {
		return letter;
	}

	public int getCount() {
		return count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		double result = 1;
		result = prime * result + letter;
		result = prime * result + count;
		return (int) result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordAnalyzer other = (WordAnalyzer) obj;
		if (letter != other.letter)
			return false;
		if (count != other.count)
			return false;
		return true;
	}

	public static WordAnalyzer analyze(String word) {
		char letter = 'X';
		int count = 0;

		HashMap<Character, Integer> charsCount = new HashMap<>();
		char[] charsArray = word.toLowerCase().toCharArray();

		for (char aChar : charsArray) {
			int charCount = charsCount.getOrDefault(aChar, 0) + 1;

			if (charCount >= count) {
				letter = aChar;
				count = charCount;
			}

			charsCount.put(aChar, charCount);
		}

		return new WordAnalyzer(letter, count);
	}
}
