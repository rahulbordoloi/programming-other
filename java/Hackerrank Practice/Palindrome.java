package com.practice;

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String result = "Yes";
        int length = A.length();
        for (int i = 0; i < length / 2; i++){
            if(A.substring(i, i+1).equals(A.substring(length-i-1, length-i))) {
            }
            else {
                result = "No";
            }
        }
        System.out.println(result);
    }
}



