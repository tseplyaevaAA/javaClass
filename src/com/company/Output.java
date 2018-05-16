package com.company;

import java.util.List;

public class Output {

    protected void printArr(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    protected void printArr(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    protected void printInt(int n) {
        System.out.println(n);
    }

    protected void printLong(long n) {
        System.out.println(n);
    }

    protected void printFloat(float n) {
        System.out.println(n);
    }

    protected void printString(String m) {
        System.out.println(m);
    }

    protected void printList(List m) {
        for (Object o : m) {
            System.out.println(o);
        }
    }


}

