package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class Sorts {

    protected int[] sortArr3(int[] mas) {
        int a, b, c;
        Arrays.sort(mas);
        a = mas[0];
        b = mas[1];
        c = mas[2];
        return mas;
    }

    protected int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    protected int findMaxStream(int[] arr){

        int mymax = Integer.MIN_VALUE;
        mymax = IntStream.of(arr).max().getAsInt();
        return mymax;
    }

    protected void shellSort(int[] a) {

        int st = 0;
        int n = a.length;

        int size_b = n - st;
        double[] b = new double[size_b];

        for (int i = 0; i < size_b; i++){
            b[i] = a[i + st];
        }


        ArrayList<Double> seq = new ArrayList<Double>();
        int k = 0;
        double i = 0;
        int lvl = 0;

        while (k == 0){
            int p = 0;
            int q = 0;
            int powq = 1;
            for (p = lvl; p >= 0; p--){
                i = Math.pow(2, p) *powq;
                powq *= 3;
                if (i <= (n / 2)){ seq.add(i); }
                else{
                    k++;
                    break;
                }
            }
            lvl++;
        }
        int m = seq.size();

        Collections.reverse(seq);
        //show(b, 0, size_b);

        double x;
        double gap;
        int j;
        for (k = 0; k < m; k++) { // seq
            gap = seq.get(k);
            for (double i2 = gap; i2 < size_b; ++i2) {
                x = b[(int)i];
                for ( j = (int)(i - gap); (x < b[j]) && (j >= 0); j = (int)(j - gap))
                    b[(int)(j + gap)] = b[j];
                b[(int)(j + gap)] = x;

            }
        }

        for (int p = 0; p < size_b; p++){
            a[p] = (int) b[p];
        }

    }

    int compare(int[] a, int[] b) {
        int i = -2;
        if (a.length < b.length) {
            i = -1;
        }
        if (a.length > b.length) {
            i = 1;
        }
        if (Arrays.equals(a, b)) {
            i = 0;
        }
        return i;
    }

}