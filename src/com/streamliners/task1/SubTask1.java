package com.streamliners.task1;

import java.util.HashMap;

public class SubTask1 {

    public static void main(String[] args) {

        System.out.println(modify("12332321", "2R3S1T4D"));
    }

    private static String modify(String s, String replacements) {

        //Created a hashmap to store the corresponding values
        HashMap<Integer,Character> hashMap = new HashMap<>();

        // Inserting values by iterating into the "replacements" string
        for (int i=0;i<replacements.length();i+=2)
        {

            //Checking for replacements string
            try
            {
                if((replacements.charAt(i+1)-'0')>=0 && (replacements.charAt(i+1)-'0')<=9)
                {
                    throw new InvalidReplacementsException("Invalid Input String");
                }
            }catch (InvalidReplacementsException e){
                System.out.println(e);
                return null;
            }
            hashMap.put(replacements.charAt(i) - '0' ,replacements.charAt(i+1));
        }
        String finalString = new String();

        // Finally creating a new string
        for(int i=0;i<s.length();i++)
        {
            //Checking for string s
            try
            {
                if(hashMap.get(s.charAt(i)-'0') == null)
                {
                    throw new InvalidReplacementsException("Invalid Input String");
                }
            }catch (InvalidReplacementsException e){
                System.out.println(e);
                return null;
            }
            finalString+=hashMap.get(s.charAt(i) - '0');
        }
        return finalString;
    }

}
