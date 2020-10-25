// Link - https://www.hackerrank.com/challenges/java-bigdecimal/problem

package com.hackerrank;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalClass {

    public static void main(String[] args){

        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n + 2];
        for(int i=0; i<n; i++){
            s[i] = sc.next();
        }
        sc.close();

        // Answer
        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                BigDecimal bigDec1 = new BigDecimal((String) s);
                BigDecimal bigDec2 = new BigDecimal((String) t1);
                return bigDec2.compareTo(bigDec1);
            }
        });


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
