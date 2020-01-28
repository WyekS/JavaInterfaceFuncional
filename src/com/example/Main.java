package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {

        int[] arraynim = {1, 23, 4, 3, 1};

        final List<Integer> result = Arrays.stream(arraynim)
                .boxed()
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        Z07Analyzer.main(args);
    }
}
