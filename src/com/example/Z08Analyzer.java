package com.example;

import static com.example.StringAnalyzer.contains;
import static com.example.StringAnalyzer.startsWith;

public class Z08Analyzer
{
    public static void main(String[] args)
    {
        String[] strList =
                {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);


        System.out.println("==Contains==");
        StringAnalyzer.searchArr(strList, searchStr, contains);

        System.out.println("==Starts With==");
        StringAnalyzer.searchArr(strList, searchStr, startsWith);
    }
}
