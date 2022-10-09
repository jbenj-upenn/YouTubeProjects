package practice;

import java.util.Scanner;

public class ReverseString {
    //Reverse a string of letters
    public static void main(String[] args) {
        //String r houses the results of reverse method
        // reverse method lets the program know that this is what it refers to in line 14
        String r = reverse("Strawberry pancakes are better than blueberry pancakes!");
        System.out.println(r);
    }
    //create new method with code that reverses the string
    //change 'void' to 'String'
    //we need to store the string and then reverse each character with an array
    //the reverse method makes String s correspond to String r (reverse String)
    public static String reverse(String s) {
        //declare an array of letters which is the size of String s (String r)
        char [] letters = new char[s.length()];
        //use a for loop to get each character of a string
        //i = 0 starts with the first spot of the string and iterates through the loop
        // create an index for letters
        int letterIndex = 0;
        //for loop: i equals the last index of the string (!)
        for(int i = s.length() - 1; i >= 0; i--) {
            //*** make character at 0 (line 21) = character at i (i.e., the last character)
            //***this puts the ! in the first index of the new string
            letters[letterIndex] = s.charAt(i);
            //go to next index of character array while i is decremented by one (line 23)
            letterIndex++;
        }
        //empty String;
        String reverse = "";
        //for loop just constructs the reversed string
        for(int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }
        //return final reversed string back to original method call (line 8) and print it out (line 9)
        return reverse;
    }
}