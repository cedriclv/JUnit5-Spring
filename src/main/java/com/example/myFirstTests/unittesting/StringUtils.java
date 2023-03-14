package com.example.myFirstTests.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * 
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères, en
     * eliminant les doublons
     * 
     * @return Chaine avec uniquement des voyelles
     */
    public static String uniqueVowels(String candidate) {
        String uniqueVowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                if (uniqueVowels.indexOf(letters[i]) == -1) {
                    uniqueVowels += letters[i];
                }
            }
        }
        return uniqueVowels;
    }

}
