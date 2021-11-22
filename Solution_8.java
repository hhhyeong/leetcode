import java.io.*;
import java.util.*;
import javda.text.*;
import java.math.*;
import java.util.regex.*;

// n라인 입력받은 후(EOF 입력될때까지), n줄 라인 모두 출력해.
// Scanner 클래스 - Scanner.hasNext() : 입력된 토큰이 있으면 true, 아니면 false 반환.
// BufferedReader 클래스 - BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public class Solution_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        // 'EOF' 나올때까지 입력받기
        while (scan.hasNext()) {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
    }
}