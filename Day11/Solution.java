import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int k;
        int l;
        int max =-1000;
        for (int i = 0; i < 4; i++ ) {
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for ( k = i; k < i + 3;k++) {
                    for ( l = j; l < j + 3; l++) {
                        sum = sum + arr[k][l];
                    }
                }
                sum = sum - (arr[k - 2][j] +arr[k - 2][j + 2]);
                if (sum>max) {
                    max = sum;
                    }
            }
        }
            System.out.println(max);

        scanner.close();
    }
}