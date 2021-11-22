import java.util.Scanner;

public class Solution_211122_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long x = 0;
        // long y = 0;
        boolean a;

        // t번 반복
        for (int i = 0; i < t; i++) {
            a = false;

            // 2의 31승
            // System.out.println(Math.pow(2,31));
            // y = sc.nextLong();
            // System.out.println(y);
            try {
                x = sc.nextLong(); 
                if (x > (-1) * Math.pow(2,63) && x < (-1) * Math.pow(2,31) && x > Math.pow(2,31) && x < Math.pow(2,63)) {
                    System.out.println((-1) * Math.pow(2,63));
                    System.out.println((-1) * Math.pow(2,31));
                    System.out.println(Math.pow(2,63));
                    System.out.println(Math.pow(2,31));
                    System.out.println(Math.pow(2,15));
                    System.out.println(Math.pow(2,31));
                    System.out.println(x + " can be fitted in");
                    System.out.println("* long");
                } else if (x >= (-1) * Math.pow(2,31) && x <= (-1) * Math.pow(2,15) && x >= Math.pow(2,15) && x <= Math.pow(2,31)) {
                    System.out.println((-1) * Math.pow(2,31));
                    System.out.println((-1) * Math.pow(2,15));
                    System.out.println(Math.pow(2,15));
                    System.out.println(Math.pow(2,31));
                    System.out.println(x + " can be fitted in");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (x > (-1) * Math.pow(2,15) && x < (-1) * Math.pow(2,7) && x > Math.pow(2,7) && x < Math.pow(2,15)) {
                    System.out.println((-1) * Math.pow(2,15));
                    System.out.println((-1) * Math.pow(2,7));
                    System.out.println(Math.pow(2,7));
                    System.out.println(Math.pow(2,15));
                    System.out.println(x + " can be fitted in");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");

                // 
                } else if (x >= (-1) * Math.pow(2,7) && x <= Math.pow(2,7)) {
                    // System.out.println((-1) * Math.pow(2,7));
                    // System.out.println(Math.pow(2,7));
                    System.out.println(x + " can be fitted in");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    System.out.println(x + " can't be fitted in");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(x + " can't be fitted in");
            }
        }
    }
}