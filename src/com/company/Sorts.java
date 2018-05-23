package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

import static java.lang.Math.pow;

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

    protected void shellSort(int[] array) {
        int inner, i;
        int temp;

        int h = 1;

        while (h <= array.length / 3) {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) {
            for (i = h; i < array.length; i++) {
                temp = array[i];
                inner = i;
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
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