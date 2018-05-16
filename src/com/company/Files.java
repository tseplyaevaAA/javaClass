package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class Files {

    protected float koef = (float) 0.3;

    //reads a file and returns a reversed list
    protected List readFile(String path) {
        List a = new LinkedList<String>();
        List b = new LinkedList<String>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8))) {
            String line;

            while ((line = reader.readLine()) != null) {
                //  System.out.println(line);
                a.add(line);
            }
        } catch (IOException e) {
        }

        for (int i = 0; i < a.size(); i++) {
            b.add(0, a.get(i));
        }
        return b;
    }

    //copies file to another
    protected void copyFile(String path1, String path2) {
        List a = new LinkedList<String>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path1), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
               //   System.out.println(line);
                a.add(line);
            }
        } catch (IOException e) {
        }

        if(!a.isEmpty()) {
            File file = new File(path2);
            FileWriter fr = null;
            try {
                fr = new FileWriter(file);
                for (Object str : a) {
                    fr.write((String) str + System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else
        {
            System.out.println("The  file is empty.Nothing to copy");
        }

    }

    //copies 1 file to another with some changes
    protected void copyChange(String path1, String path2) {
        List a = new LinkedList<String>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path1), StandardCharsets.UTF_8))) {
            String line;

            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                line = line.toUpperCase();
                line = line.replace(" ", "  ");
                a.add(line);
            }
        } catch (IOException e) {
        }

        if (!a.isEmpty()) {
            File file = new File(path2);
            FileWriter fr = null;

            try {
                fr = new FileWriter(file);
                for (Object str : a) {
                    fr.write((String) str + System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("A file was empty");
        }
    }

    // divides 1 file into 2 in koef relation
    protected void copyIntoTwo(String path1, String path2, String path3) {
        List a = new LinkedList<String>();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path1), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                a.add(line);
            }
        } catch (IOException e) {
        }

        if (!a.isEmpty()) {
            //counts all symbols
            int amount = 0;
            for (Object str : a) {
                String str1 = (String) str;
                amount += str1.length();
            }

            int firpart = 0;
            firpart = (int) Math.floor(amount * koef);
            int secpart = 0;
            secpart = amount - firpart;

            File file = new File(path2);
            FileWriter fr = null;
            File file1 = new File(path3);
            FileWriter fr1 = null;
            try {
                fr = new FileWriter(file);
                fr1 = new FileWriter(file1);
                int flag = 0;
                String str3;
                String str2;
                for (Object str : a) {
                    String str1 = (String) str;
                    if (str1.length() <= firpart && flag == 0) {
                        fr.write(str1 + System.lineSeparator());
                        firpart = firpart - str1.length();
                    } else {
                        if (flag == 0 && firpart > 1) {
                            str2 = str1.substring(0, firpart);
                            str3 = str1.substring(firpart, str1.length());
                            fr.write(str2 + System.lineSeparator());
                            fr1.write(str3 + System.lineSeparator());
                            flag = 1;
                            firpart = 0;
                        } else {
                            fr1.write(str1 + System.lineSeparator());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                    fr1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("Nothing to separate.File is empty");
        }
    }


    protected String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            //.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

    // prints all names of txt files
    protected void showTxt(String path) {
        File myFolder = new File(path);
        File[] files = myFolder.listFiles();
        if (files.length != 0) {
            for (int i = 0; i < files.length; i++) {
                String str = "txt";
                String str2 = getFileExtension(files[i]);
                if (str.equals(getFileExtension(files[i]))) {
                    System.out.println(files[i].getName());
                }
            }
        }else
        {
            System.out.println("The list is empty");
        }

    }


}