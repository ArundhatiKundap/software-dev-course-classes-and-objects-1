package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"

    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.
    public static boolean shortString(String givenString){
        return givenString.length() < 5;
    }
    public static char firstLetter(String givenString){
        return givenString.charAt(0);
    }
    public static String censorAsparagus(String givenString){
        return givenString.replace("asparagus", "****");
    }
    public static String bigger(String firstSting,String secondString){
        if(firstSting.length()>secondString.length() || firstSting.length()==secondString.length()){
            return firstSting;
        }else{
            return secondString;
        }
    }
}
