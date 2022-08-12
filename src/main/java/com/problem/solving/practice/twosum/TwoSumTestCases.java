package com.problem.solving.practice.twosum;

import java.util.Arrays;

public class TwoSumTestCases {
    public static void main(String args[]){
        TwoSumSolution twoSumSolution=new TwoSumSolution();
        int array[]={1, 2, 4, 7,10};
        int expecOutput[]={1,4};
        int output[]=twoSumSolution.twoSum( array ,12);
        boolean returnVal1 = Arrays.equals(expecOutput,output);
        System.out.println("Array expected Output  and b Output?: " + returnVal1);

    }
}
