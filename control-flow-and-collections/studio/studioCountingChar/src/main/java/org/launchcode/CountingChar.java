package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> CharacterCounts = new HashMap<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String userInput= input.nextLine().toLowerCase();
        String testString = userInput.toLowerCase();
        //String testString = "This is the test string";

        if (i == )
        char[] charactersInString = testString.toCharArray();

        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }

        }
    }
    for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet() {
        System.out.println(oneChar.getKey() + ": ") + oneChar.getValue());
    }
}