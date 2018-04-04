package com.kcorkrad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TernaryTree {

    private static List<String> getValuesFromFile(String filename) {
        List<String> list = new ArrayList<String>();
        File file = new File(filename);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String nodeValue;

            while ((nodeValue = reader.readLine()) != null) {
                list.add(nodeValue);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String args[]){

        // Define a data structure to represent a rooted tree like this one:
        //
        //           C
        //         / | \
        //        /  |  \
        //       E   F   S
        //     H   B   P   D
        //
        // The data structure should be able to support trees of any size, and the methods
        // should work for all trees.
        //
        // (a) Write a method that, when given this tree, returns "C E H B F S P D".
        //
        // (b) Write a second method that returns "C E F S H B P D" given the same tree.

        // rewrite to accept argument -f for file
        List<String> list = getValuesFromFile(args[0]);

        //print out the list
        System.out.println(list);

        boolean result = isSumTwoIntsZero(list);

        if (result) {
            System.out.println();
        }
    }
}
