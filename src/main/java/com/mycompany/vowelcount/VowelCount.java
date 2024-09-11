/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;

/**
 *
 * @author siyab
 */
import java.util.Scanner;

public class VowelCount {

    // Function to count the number of vowels in a given string
    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase to handle both cases (upper and lower)
        sentence = sentence.toLowerCase();
        
        // String containing vowels to compare each character
        String vowels = "aeiou";
        
        int count = 0;
        
        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            
            // Check if the current character is a vowel
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
        }
        
        return count; // Return the total number of vowels
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input a sentence from the user
        System.out.println("Enter a sentence: ");
        String sentence = sc.next();
        
        // Call the countVowels function and display the result
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
        
    }
}


