import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fact = 1;
        for(int i = n;i >= 1;i--){
            fact *= i;
        }
        System.out.println(fact);
    }
}
