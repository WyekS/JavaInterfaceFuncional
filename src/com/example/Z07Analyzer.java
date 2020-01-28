package com.example;

import static com.example.StringAnalyzer.contains;
import static com.example.StringAnalyzer.startsWith;

public class Z07Analyzer
{
    public static void searchArr(String[] strList, String searchStr, StringAnalyzer analyzer)
    {

        for (String currentStr : strList)
        {
            if (analyzer.analyze(currentStr, searchStr))
            {
                System.out.println("Match: " + currentStr);
            }
        }
    }

    public static void main(String[] args)
    {
        String[] strList =
                {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);


        System.out.println("==Contains==");
        Z07Analyzer.searchArr(strList, searchStr,
                contains);

        System.out.println("==Starts With==");
        Z07Analyzer.searchArr(strList, searchStr,
                startsWith);
    }
}
