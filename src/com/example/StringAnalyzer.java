package com.example;

public interface StringAnalyzer
{
    boolean analyze(String sourceStr, String searchStr);

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

    // Lambda expressions can be treated like variables
    // public static final is redundant
    public static final StringAnalyzer contains = String::contains;
    public static final StringAnalyzer startsWith = String::startsWith;

}
