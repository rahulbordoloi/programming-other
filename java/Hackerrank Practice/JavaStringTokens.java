// Link - https://www.hackerrank.com/challenges/java-string-tokens/problem

package com.hackerrank;

import com.sun.javaws.IconUtil;

import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {

        // Answer
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNext()){
            System.out.println(0);
        }
        else{

            // Old Logic
            /*
            if(s.length() == 0 || s.equals(" ")){
                System.out.println(0);
            }*/

            String s = sc.nextLine();
            String[] splittedString = s.trim().split("[ !,?._'@]+");
            ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList(splittedString));
            System.out.println(listOfStrings.size());
            for (String i : listOfStrings) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
