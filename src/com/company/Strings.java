package com.company;

import java.math.BigInteger;

public class Strings {

    protected void getChar(String a, int i) {
        char ch;
        if (i < a.length()  && i > -1) {
            ch = a.charAt(i);
            System.out.println(ch);
        } else {
            System.out.println("Incorrect index");
        }
    }

    protected String ifContains(String a, CharSequence b) {
        String str1 = b.toString();
        String ans;
        if (a.contains(str1)) {
            ans = "String contains a sequence";
        } else {
            ans = "String doesn`t contain a sequence";
        }
        return ans;
    }

    protected String counInitials(String a) {
        String n = "";
        String[] mystr = a.split(" ");

        n+= mystr[0].substring(0,1);
        n+= mystr[1].substring(0,1);
        n+= mystr[2].substring(0,1);
        return n;
    }

    protected String checkAnagram(String a, String b) {
        a = a.replace(" ", "");
        b = b.replace(" ", "");
        a = a.toLowerCase();
        b = b.toLowerCase();
        String ans;
        int k = 0;
        if(a.length()!= b.length()){   ans = "It`s not an anagram";}
        else {
            while (!a.equals("")) {
                String part = a.substring(0, 1);
                a = a.substring(1, a.length());

                if (b.contains(part) == true) {
                    b = b.replaceFirst(part, "");
                }
            }

            if (b.equals("")) {
                ans = "It`s an anagram";
            } else {
                ans = "It`s not an anagram";
            }
        }
        return ans;
    }

    protected void turnToDecimal(String a) {
        a = a.toUpperCase();
        if (a.length() <= 16 && a.length() > 8) {
            int b = Integer.parseInt(a, 16);
            System.out.println(b);
        }
        if (a.length() <= 8) {
            long b = Long.parseLong(a, 16);
            System.out.println(b);
        }
        if (a.length() <= 32 && a.length() > 16) {
            BigInteger b = new BigInteger(a, 16);
            System.out.println(b);
        }
    }

    protected boolean checkForHex(String a){
        boolean m = false;
        int k=0;
       a =  a.toUpperCase();
        for (int i=0; i<a.length();i++){
            if (a.charAt(i) == '0' || a.charAt(i) == '1'||a.charAt(i) == '2'||a.charAt(i) == '3'||a.charAt(i) == '4'||
                    a.charAt(i) == '5'||a.charAt(i) == '6'||a.charAt(i) == '7'||a.charAt(i) == '8'||
                    a.charAt(i) == '9'||a.charAt(i) == 'A'||a.charAt(i) == 'B'||
                    a.charAt(i) == 'C'||a.charAt(i) == 'D'||
                    a.charAt(i) == 'E'|| a.charAt(i) == 'F') {
                k++;
            }
        }
        if (k == a.length() ){
            m = true;
        }
        return m;
    }

}

