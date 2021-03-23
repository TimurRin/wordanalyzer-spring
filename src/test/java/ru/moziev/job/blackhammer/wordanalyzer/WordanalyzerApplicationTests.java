package ru.moziev.job.blackhammer.wordanalyzer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WordanalyzerApplicationTests {

	@Test
	@DisplayName("Test word 'test'")
	void testWordTest() {
		WordAnalyzer expected = new WordAnalyzer('t', 2);

		assertEquals(expected, WordAnalyzer.analyze("Test"));
		assertEquals(expected, WordAnalyzer.analyze("test"));
	}

	@Test
	@DisplayName("Test word 'tester'")
	void testWordTester() {
		WordAnalyzer expected = new WordAnalyzer('e', 2);

		assertEquals(expected, WordAnalyzer.analyze("tester"));
		assertEquals(expected, WordAnalyzer.analyze("testEr"));
	}
}
