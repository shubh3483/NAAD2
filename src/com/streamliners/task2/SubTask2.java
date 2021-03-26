package com.streamliners.task2;

import java.util.HashMap;

public class SubTask2 {

    public static void main(String[] args) {
        System.out.println(getOccurrencesHashMap("1;2;2;2;3;1"));
    }

    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        //Getting the strings using the split method
        String stringElementsArray[] = s.split(";");

        /*
            Converting string array  into integer array and for every element creating a map for that element to
            count the pairs
        */
        Integer integerElementsArray[] = new Integer[stringElementsArray.length];
        for (int i=0;i<stringElementsArray.length;i++)
        {
            integerElementsArray[i] = Integer.parseInt(stringElementsArray[i]);
            if(hashMap.containsKey(integerElementsArray[i]))
            {
                hashMap.put(integerElementsArray[i],hashMap.get(integerElementsArray[i])+1);
            }
            else hashMap.put(integerElementsArray[i],1);
        }

        return hashMap;
    }

}
