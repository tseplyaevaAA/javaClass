package com.company;


import java.util.stream.IntStream;
import java.util.Arrays;

public class Arrays1 {


    protected long countSumDig(char[] a) {
        long m = 0;
        for (int i = 0; i < a.length; i++) {
            m += (long) Character.getNumericValue(a[i]);
        }
        return m;
    }

    protected int findSmallestDist(int[] a) {
        int m = Integer.MAX_VALUE;
        if(a.length<=1){return -1;
        }else{
            int index = -1;
            // check
            for (int i = 0; i < a.length - 1; i++) {
                if (Math.abs(a[i] - a[i + 1]) < m) {
                    m = Math.abs(a[i] - a[i + 1]);
                    index = i;
                }
            }
            return index;}
    }

    protected int[][] countMulTable(int n) {
        if(n>=0){
            int[][] a = new int[n][n];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    a[i - 1][j - 1] = j * i;
                }
            }
            return a;
        }else{
            int [][]b = new int[0][0];
            return b;
        }
    }

    protected float countAverage(int[] a) {
        float average = 0;
        for (int b : a) {
            average += b;
        }
        average /= a.length;
        return average;
    }

    protected double countAverageStream(int[] a){
        double average = 0;

        average = Arrays.stream(a)
                .average().getAsDouble();



      //  average /= a.length;
        return average;
    }
}
