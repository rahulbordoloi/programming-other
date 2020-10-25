// Link - https://www.hackerrank.com/challenges/java-string-compare/problem

package com.hackerrank;

import java.util.*;

public class JavaSubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        // Answer
        for(int i = 0; i < s.length() - k + 1; i++){
            String sub = s.substring(i, i+k);
            if(smallest.compareTo(sub) > 0){
                smallest = sub;
            }
            else if(largest.compareTo(sub) < 0){
                largest = sub;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
