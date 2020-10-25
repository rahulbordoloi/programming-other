// Link - https://www.hackerrank.com/challenges/java-biginteger/problem

package com.hackerrank;

import java.util.*;
import java.math.BigInteger;

public class BigIntegerClass {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        BigInteger x = new BigInteger(num1);
        BigInteger y = new BigInteger(num2);
        System.out.println(x.add(y));
        System.out.println(x.multiply(y));

    }
}
