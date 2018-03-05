package edu.knoldus.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

    public List<Integer> findPrimeNumbers() {
        List<Integer> numbersList = IntStream.range(1,100).boxed().collect(Collectors.toList());
        System.out.println("Input list = " + numbersList);
        List<Integer> resultantList = new ArrayList<>();
        numbersList.forEach(elem -> {
            if(isPrime(elem) != -1){
                resultantList.add(elem);
            }
        });
        return resultantList;
    }

    private int isPrime(int number){

       for(int i =2;i<number/2;i++){
            if(number % i != 0) {
                return number;
            }
        }
        return -1;
    }
}
