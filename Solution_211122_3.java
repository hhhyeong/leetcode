import java.io.*;


// scanner.hasNext()
public class Solution_211122_3 {
    public static void main(String[] args) {
        // System.out.println("hi");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a;
        int i = 1;
        try {
            while((a = reader.readLine()) != null) { // a가 null이 아니면 반복 아니면 종료
                // 비지니스로직
                System.out.println(i + " " + a);
                i++;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}