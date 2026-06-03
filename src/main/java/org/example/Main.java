package org.example;


import leetcode.SingleNumber.SingleNumberSolution;

public class Main {
    public static void main(String[] args) {
        SingleNumberSolution singleNumberSolution = new SingleNumberSolution();

        int[] a = new int[]{4,1,2,1,2};

        System.out.println(singleNumberSolution.singleNumber(a));
    }
}