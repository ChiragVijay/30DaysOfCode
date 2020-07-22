import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s = new Scanner(System.in);
    int numTimes = s.nextInt();
    for (int i = 0; i < numTimes; i++) {
        String toScan = s.next();
        String odd = "";
        String even = "";

        for (int j = 0; j < toScan.length(); j++) {
            if (j % 2 == 0) {
                even = even + toScan.charAt(j);
            } else {
                odd = odd + toScan.charAt(j);
            }
        }
        System.out.println(even + " " + odd);
    }
    }
}
