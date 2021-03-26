package com.streamliners.task2;

import java.util.*;

public class SubTask3 {

    public static void main(String[] args) {
        startGame("SHAMBHO");
    }

    private static void startGame(String s) {

        Scanner scanner = new Scanner(System.in);

        /*
            This is made to make showString(a new string) only with vowels
         */
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        StringBuilder showString = new StringBuilder(s);
        String tempShowString = s;

        /*
            This is made to check the presence of the character which we will be taking from the user
         */
        HashMap<Character,Integer> positionOfCharacter = new HashMap<>();


        /*
            This is generating showString with ___  and calculating the no of chances
         */
        int noOfConsonants = 0;
        int totalChances = 0;
        ArrayList<Integer> tempArrayList = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!vowel.contains(s.charAt(i)))
            {
                showString.setCharAt(i,'_');
                noOfConsonants++;
                positionOfCharacter.put(s.charAt(i),i);
            }
        }

        totalChances = noOfConsonants+3;

        /*
            This is the function which is finding whether the input character is present in the string or not.
         */
        while(totalChances!=0 && !tempShowString.equals(showString.toString()))
        {
            System.out.println("Word : "+showString);
            System.out.println("Chances : "+totalChances);
            System.out.println("Guess : ");
            char input = scanner.next().charAt(0);
            if(!positionOfCharacter.containsKey(input))
            {
                System.out.println("Character not found");
            }
            else
            {
                System.out.println("Character is Present");
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i) == input)
                        showString.setCharAt(i,input);
                }
            }
            totalChances--;
        }

        /*
            Finally checking the condition at the last.
         */
        if(totalChances == 0 && !tempShowString.equals(showString.toString()))
            System.out.println("BETTER LUCK NEXT TIME");
        else System.out.println("YOU WON");

    }

}
