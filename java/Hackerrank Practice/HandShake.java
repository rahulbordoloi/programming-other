// Link - https://www.hackerrank.com/challenges/handshake/problem

// Importing Packages
package com.hackerrank;
import java.io.*;
import java.util.*;

// Public class HandShake
public class HandShake {

    static int handshake(int n){

        if(n <= 1) { return 0; }
        else{
            return n * (n - 1) / 2;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException{

        // BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("output.txt")));

        int tc = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < tc; i++){
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = handshake(n);

            System.out.println(result);
            // bw.write(String.valueOf(result));
            // bw.newLine();
        }
        // bw.close();
    }
}
