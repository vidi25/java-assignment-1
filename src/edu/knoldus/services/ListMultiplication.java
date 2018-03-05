package edu.knoldus.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListMultiplication {

    public List<Integer> multiplyLists() {
        List<Integer> inputList1 = Arrays.asList(2, 3, 4, 5);
        List<Integer> inputList2 = Arrays.asList(1, 2, 3, 4);
        return IntStream.range(0, Math.min(inputList1.size(), inputList2.size()))
                .map(index -> inputList1.get(index) * inputList2.get(index))
                .boxed().collect(Collectors.toList());
    }
}
