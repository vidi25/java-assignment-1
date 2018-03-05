package edu.knoldus.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class WordCountInFile {

    public Map<String,Integer> countWordsFromFile() throws IOException {
        FileReader in = new FileReader("src/edu/knoldus/resources/demo");
        BufferedReader br = new BufferedReader(in);
        String contents;
        String wordList = "";
        while ((contents = br.readLine()) != null) {
            wordList = wordList.concat(contents + " ");
        }

        Map<String, Integer> wordCount = Arrays.stream(wordList.split(" "))
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                .filter(word -> word.length() > 0)
                .map(word -> new AbstractMap.SimpleEntry<>(word, 1))
                .collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue, (v1, v2) -> v1 + v2));
       return wordCount;
    }
}
