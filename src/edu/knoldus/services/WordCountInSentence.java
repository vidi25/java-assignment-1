package edu.knoldus.services;

import edu.knoldus.entities.WordCounting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class WordCountInSentence {

    public Map<String, List<WordCounting>> getCountOfWordsInSentence(String userInputString) {
        return Arrays.stream(userInputString.split(" "))
                .map(words -> new WordCounting(words, 1))
                .collect(groupingBy(countWord -> countWord.words));
    }
}
