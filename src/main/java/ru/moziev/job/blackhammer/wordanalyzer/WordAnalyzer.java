package ru.moziev.job.blackhammer.wordanalyzer;

public class WordAnalyzer {
	private final char letter;
	private final int count;

	public WordAnalyzer(char letter, int count) {
		this.letter = letter;
		this.count = count;
	}

	public char getLetter() {
		return letter;
	}

	public int getCount() {
		return count;
	}

	public static WordAnalyzer analyze(String word) {
		return new WordAnalyzer('X', 0);
	}
}
