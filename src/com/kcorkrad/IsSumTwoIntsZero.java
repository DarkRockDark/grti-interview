package com.kcorkrad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IsSumTwoIntsZero {

    private static List<Integer> getIntsFromFile(String filename) {
        List<Integer> list = new ArrayList<Integer>();
        File file = new File(filename);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        return list;
    }

    private static boolean isSumTwoIntsZero(List<Integer> list){
        // brute force solution
        // think of better option afterwards
        int a,b;
        int sum;
        for (int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){
                a = list.get(i);
                b = list.get(j);
                sum = a + b;
                System.out.println("sum " + a + " + " + b + " = " + sum);
                if ((list.get(i) + list.get(j)) == 2) return true;
            }
        }
        return false;
    }
    public static void main(String args[]){

        // A console application that:
        //
        // - Accepts as an argument the name of a file containing a newline-delimited list of integers.
        //
        // - Prints "true" if the file contains any two integers that sum to zero.
        final String TRUE = "true";

        // rewrite to accept argument -f for file
        List<Integer> list = getIntsFromFile(args[0]);

        if (isSumTwoIntsZero(list)) {
            System.out.println(TRUE);
        }
    }
}
