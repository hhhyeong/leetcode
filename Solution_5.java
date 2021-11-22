import java.util.Scanner;
 
/*
// Java Output Formatting

    String 다음에 정수가 나옴.
    각 문자열은 최대 10 알파벳 문자 및 각 정수는 다음의 포함 범위에 있음.
    https://www.hackerrank.com/challenges/java-output-formatting/problem?h_r=next-challenge&h_v=zen
    alphabet길이 : 10 이하
    숫자 범위 : 0-999
    첫번째열 출력 길이 : 15
    두번째열 출력 길이 : 3 (앞쪽은 0으로 채우기.)
*/
public class Solution_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            System.out.printf("%-15s", s1);
            System.out.printf("%03d", x);
            System.out.println();
        }
        System.out.println("================================");
    }
}