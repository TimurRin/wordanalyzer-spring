package ru.moziev.job.blackhammer.wordanalyzer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wordanalyzer")
public class WordAnalyzerController {
	@GetMapping("/analyze")
	public WordAnalyzer greeting(@RequestParam(value = "word", defaultValue = "test") String word) {
		return WordAnalyzer.analyze(word);
	}
}