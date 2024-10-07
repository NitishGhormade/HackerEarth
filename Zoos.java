import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());

        int cntZ = 0;
        for(int i = 0;i < sb.length();i++){
            if(sb.charAt(i) == 'z'){
                cntZ = cntZ + 2;
            }
            else{
                cntZ--;
            }
        }

        if(cntZ == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
