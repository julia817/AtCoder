//Shejia Zhu
//2018-06-20

import java.util.*;

public class P100B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int output = 0;
        switch (d) {
            case 0:
                if (n==100)
                    output = 101;
                else
                    output = n;
                break;
            case 1:
                if (n==100)
                    output = 10100;
                else
                    output = 100*n;
                break;
            case 2:
                if (n==100)
                    output = 1010000;
                else
                    output = 10000*n;
                break;
        }

        System.out.println(output);
    }
}
