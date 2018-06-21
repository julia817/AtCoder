//Shejia Zhu
//2018-06-20

import java.util.*;

public class P100C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        while (!(allOdd(a))) {
            for (int i=0; i<n; i++) {
                if (a[i]!=2 && a[i]%2 == 0) {
                    a[i] /= 2;
                    count++;
                }
                else
                    a[i] *= 3;
            }
        }

        System.out.println(count);
    }

    public static boolean allOdd (int[] a) {
        for (int i: a) {
            if (i%2 == 0)
                return false;
        }
        return true;
    }
}
