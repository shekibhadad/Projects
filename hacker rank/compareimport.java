import java.util.Scanner;

public class compareimport java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aliceScore = 0;
        int bobScore = 0;

        int[] a = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i])
                aliceScore++;
            else if (a[i] < b[i])
                bobScore++;
        }

        System.out.println(aliceScore + " " + bobScore);
    }
} {
    
}
