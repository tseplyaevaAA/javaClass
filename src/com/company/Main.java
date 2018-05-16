package com.company;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Input in = new Input();
        Arrays1 arr = new Arrays1();
        Sorts sort = new Sorts();
        Strings str = new Strings();
        Files file = new Files();
        Output out = new Output();

        System.out.println("Number of task:");
        Scanner num = new Scanner(System.in);
        String n1 = num.nextLine();

        switch(n1){
            case "1.1":
                //task1.1
                char[] a = in.inputChArr();
                long ans = arr.countSumDig(a);
                out.printLong(ans);
                ; break;

            case "1.2":
                //task1.2
                int[] b = in.inputNumArr();
                int ind = arr.findSmallestDist(b);
                if(ind == -1){
                    System.out.println("Incorrect length of an array");
                }else{
                    out.printInt(ind);
                }break;

            case "1.3":
                //task1.3
                int n = in.inputN();
                int[][] ar = arr.countMulTable(n);
                if(ar.length>0){
                    out.printArr(ar);}
                else{
                    System.out.println("Incorrect n");
                }break;

            case "1.4" :
                //task1.4
                int[] b2 = in.inputNumArr();
                if(b2.length>0){
                    float fl = arr.countAverage(b2);
                    out.printFloat(fl);}else{
                    System.out.println("Incorrect length of an array");
                }break;


            case "1.5" :
                //task1.5
                int[] b3 = in.inputNumArr();
                if(b3.length>0){
                    double fl1 = arr.countAverageStream(b3);
                    System.out.println(fl1)
                   ;}else{
                    System.out.println("Incorrect length of an array");
                }break;

            case "2.1":
                //task2.1
                int[] mas = in.inputNumArr();
                if(mas.length==3){
                    mas = sort.sortArr3(mas);
                    out.printArr(mas);}else{
                    System.out.println("Incorrect length of an array");
                }break;

            case "2.2":
                //task2.2
                int[] b8 = in.inputNumArr();
                if(b8.length>0){
                    int max = sort.findMax(b8);
                    out.printInt(max);}else{
                    System.out.println("Incorrect length of an array");
                }break;

            case "2.3":
                //task 2.3
                int[] b81 = in.inputNumArr();
                if(b81.length>0){
                    int max2 = sort.findMaxStream(b81);
                    out.printInt(max2);}else{
                    System.out.println("Incorrect length of an array");
                }
                break;

            case "2.4": //task2.4
                int[] b7 = in.inputNumArr();
                if(b7.length>0){
                    sort.shellSort(b7);
                    out.printArr(b7);}
                else{
                    System.out.println("Incorrect length of an array");
                }
                break;

            case"2.5":
                //task2.5
                int[] b4 = in.inputNumArr();
                int[] b5 = in.inputNumArr();
                if((b4.length>0)&&(b5.length>0)) {
                int ans1 = sort.compare(b4, b5);
                out.printInt(ans1);}
                else{
                    System.out.println("Incorrect length of an array");
                }
                break;

            case "3.1":
                //task3.1
                String a2 = in.inputString();
                int ind2 = in.inputN();
                if(!(a2.equals(""))){
                    if(ind2>-1 && ind2<a2.length()){
                        str.getChar(a2, ind2);
                    }else
                    {
                        System.out.println("Incorrect index");
                    }
                }else{
                    System.out.println("Incorrect string");
                }
               break;

            case "3.2":
                //task3.2
                String a1 = in.inputString();
                CharSequence a3 = in.inputChVal();
                if (a1.length()>0 && a3.length()>0){
                String ans11 = str.ifContains(a1, a3);
                out.printString(ans11);}
                else{
                    System.out.println("Incorrect string or char sequence");
                }break;

            case "3.3":
                //task3.3
                String a33 = in.inputString();
                if(a33.length()>0){
                int ans2 = str.counInitials(a33);
                out.printInt(ans2);}else{
                    System.out.println("Incorrect string ");
                }
                break;

            case "3.4":
                //task3.4
                String a7 = in.inputString();
                String a4 = in.inputString();
                if(a7.length()>0 && a4.length()>0){
                String ans3 = str.checkAnagram(a7, a4);
                out.printString(ans3);}
                else{
                    System.out.println("Incorrect string");
                }break;

            case "3.5":

                //task3.5
                String a5 = in.inputString();
                if(a5.length()>0 && str.checkForHex(a5)){
                str.turnToDecimal(a5);}
                else{
                    System.out.println("Incorrect string");
                }break;

            case "4.1":
                //task4.1
                //example:  B:\\project1\\src\\my_pack\\textFiles\\4.1.txt
                String path = in.inputString();
                if (!(path.equals(""))){
                List m = file.readFile(path);
                if(m.isEmpty() == true){
                    System.out.println("File was empty");
                }
                    out.printList(m);
                 }else{
                    System.out.println("A path to file was empty");
                }
               break;

            case "4.2":

                //task4.2
                //example:  B:\\project1\\src\\my_pack\\textFiles
                String path7 = in.inputString();
                if (!(path7.equals(""))){
                file.showTxt(path7);}else{
                    System.out.println("A path to file was empty");
                }
                break;

            case "4.3":

                //task4.3
                String path2 = in.inputString();
                String path3 = in.inputString();
                if(path2.length() != 0 && path3.length() != 0 ){
                file.copyFile(path2, path3);}
                else{
                    System.out.println("One of paths was empty");
                }
                break;

            case "4.4":
                //task4.4
                String path9 = in.inputString();
                String path8 = in.inputString();
                String path6 = in.inputString();
                if(path9.length() != 0 && path8.length() != 0 && path6.length() != 0 ){
                file.copyIntoTwo(path9, path8, path6);}else{
                    System.out.println("One of paths was empty");
                }break;

            case "4.5":
                //task4.5
                String path4 = in.inputString();
                String path5 = in.inputString();
                if(path4.length() != 0 && path5.length() != 0){
                    file.copyChange(path4, path5);
                }else{
                    System.out.println("One of paths was empty");
                }
               break;
        }
    }
}
