package com.streamliners.task1;

public class SubTask3 {

    public static void main(String[] args) {
        System.out.println(isDirectlyProportional(new int[] {1,2,3,4}, new int[] {20,25,30,35}));
    }

    private static boolean isDirectlyProportional(int[] x, int[] y) {

        //Calculating the proportionality constant
        float propConstant;
        propConstant = y[0]/x[0];

        //Checking whether the numbers in the array are directly proportional or not.
        for(int i=1;i<x.length;i++)
        {
            if(y[i]/x[i] != propConstant)
                return false;
        }
        return true;
    }

}
