package com.streamliners.task1;

import java.util.HashMap;
import java.util.Map;

public class SubTask2 {

    public static void main(String[] args) {

        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }

    private static int totalWeight(String s, int[] weights) {

        //Creating hashmap to count the characters in the given string
        HashMap<Character,Integer> countMap = new HashMap<Character,Integer>();

        //Inserting values in the map and checking whether the character is already present or not.
        for (int i=0;i<s.length();i++)
        {
            if(countMap.containsKey(s.charAt(i)))
            {
                countMap.put(s.charAt(i),countMap.get(s.charAt(i))+1);
            }
            else countMap.put(s.charAt(i),1);
        }
        int countWeight = 0;
        int i = 0;

        //By iterating into the hashmap and simultaneously into the array calculating the total weight.
        for (Map.Entry entry: countMap.entrySet()) {
            countWeight+=(weights[i])*(int)entry.getValue();
            i++;
        }
        return countWeight;
    }

}
