package com.example;

public class Z02Analyzer
{
    public static void main(String[] args)
    {
        String[] strList =
                {"tomorrow", "toto", "to", "timbukto", "the", "hello", "heat"};
        String searchStr = "to";
        System.out.println("Searching for: " + searchStr);

        // Call concrete class that implments StringAnalyzer
        StringAnalyzer analyzer = new ContainsAnalyzer();

        System.out.println("===Contains===");
        for (String currentStr : strList)
        {
            if (analyzer.analyze(currentStr, searchStr))
            {
                System.out.println("Match: " + currentStr);
            }
        }
    }
}
