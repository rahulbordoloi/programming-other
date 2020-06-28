import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
    
    if ((expression.length() & 1) == 1) return false;
    else {
      char[] brackets = expression.toCharArray();
      Stack<Character> s = new Stack<>();
    for (char bracket : brackets)
    switch (bracket) {
      case '{': s.push('}'); break;
      case '(': s.push(')'); break;
      case '[': s.push(']'); break;
      default :
        if (s.empty() || bracket != s.peek())
          return false;
        s.pop();
    }
  return s.empty();
  }
}}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            boolean result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
