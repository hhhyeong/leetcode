import java.util.Scanner;

// 1. integer 입력
// 2. double 입력
// 3. String 입력
public class Solution_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Scanner scan2 = new Scanner(System.in);
        // String str = "";
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String ss = scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*******************************************************
*   String s = scan.nextLine()을 실행할 때, 앞선 입력에서 '\n'이 포함되어
*   문자열이 입력되기도 전에 넘어감.
*   => 문자열 입력받기 전에, scan.nextLine(); 로 개행문자 흡수시켜.
********************************************************/
// Solutin #2
// class xx {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i    = scan.nextInt();
//         double d = scan.nextDouble();
//         scan.nextLine();              // gets rid of the pesky newline
//         String s = scan.nextLine();
//         scan.close();
// 
//         /* Print output */
//         System.out.println("String: " + s);
//         System.out.println("Double: " + d);
//         System.out.println("Int: " + i);
//     }
// }