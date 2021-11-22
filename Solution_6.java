import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


// N = input
public class Solution_6 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            if (N >= 2 && N <= 20) {
                for (int i = 1 ; i <= 10; i++) {
                    System.out.println(N + " x " + i + " = " + i*N);
                }
                bufferedReader.close();
            } else {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
