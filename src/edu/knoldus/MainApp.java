package edu.knoldus;

import edu.knoldus.services.*;

import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {

        PrimeNumber primeNumberObject = new PrimeNumber();
        System.out.println("List of prime numbers = " + primeNumberObject.findPrimeNumbers());
        WordCountInFile wordCountFileObject = new WordCountInFile();
        System.out.println("Word Counts in file = ");
        wordCountFileObject.countWordsFromFile().forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
        ListMultiplication listMultiplyObject = new ListMultiplication();
        System.out.println("After multiplication of two lists = " + listMultiplyObject.multiplyLists());
        WordCountInSentence wordCount = new WordCountInSentence();
        String str = "Hello my name is Aman Aman is very helpful";
        System.out.println("Word Count in List =");
        wordCount.getCountOfWordsInSentence(str).forEach((k, v) -> System.out.println(String.format("\nList[%s,%s], ", k, v.size())));
        MovieOperations movieOperationObject = new MovieOperations();
        movieOperationObject.performOperationsOnMovieList();

    }
}
