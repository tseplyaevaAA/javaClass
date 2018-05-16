package com.company;

import java.util.Scanner;

public class Input {

    //returns string
    protected String inputString() {
        System.out.println("Input string:");
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        return input1;
    }

    //returns string
    protected CharSequence inputChVal() {
        System.out.println("Input char values:");
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        CharSequence b = new String(input1);
        return b;
    }



    //returns an int value
    protected int inputN() {
        System.out.println("Input n:");
        Scanner newscan = new Scanner(System.in);
        String input1 = newscan.nextLine();
        int n = Integer.parseInt(input1);
        return n;
    }

    //returns a char array
    protected char[] inputChArr() {
        System.out.println("Input an array:");
        Scanner newscan = new Scanner(System.in);
        String input1 = newscan.nextLine();
        input1 = input1.replace(" ", "");
        char[] a = input1.toCharArray();
        return a;
    }

    //returns an int array
    protected int[] inputNumArr() {
        int []a1 = new int[0];
        System.out.println("Input an array:");
        Scanner newscan = new Scanner(System.in);
        String input1 = newscan.nextLine();
        String empty = "";
        if (!(input1.equals(empty))){
            String[] integerStrings = input1.split(" ");
            int[] a = new int[integerStrings.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(integerStrings[i]);
            }
            return a;}

        else{return a1;}
    }
}

