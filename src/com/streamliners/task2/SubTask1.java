package com.streamliners.task2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubTask1 {

    public static void main(String[] args) {

        System.out.println(getList("1;2;3;4"));
    }

    private static List<Integer> getList(String s) {

        //Getting the strings using the split method
        String stringElementsArray[] = s.split(";");

        //Converting string array  into integer array
        Integer integerElementsArray[] = new Integer[stringElementsArray.length];
        for (int i=0;i<stringElementsArray.length;i++)
        {
            integerElementsArray[i] = Integer.parseInt(stringElementsArray[i]);
        }

        //Finally converting array into ArrayList
        ArrayList<Integer> integerElements = new ArrayList<Integer>(Arrays.asList(integerElementsArray));
        return integerElements;
    }

}
