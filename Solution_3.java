import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution_3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // 1 <= N <= 100
        // odd : Weird
        // even && 2~5 : Not Weird
        // even && 6~20 : Weird
        // even && 20~ : Not Weird

        if (N % 2 == 1) {
            System.out.println("Weird");
        }
        else if (N % 2 == 0 && 2<=N && 5>=N) {
            System.out.println("Not Weird");
        }
        else if (N % 2 == 0 && N>=6 && N <= 20) {
            System.out.println("Weird");
        }
        else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}