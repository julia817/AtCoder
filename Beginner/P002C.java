//Shejia Zhu
//2018-06-04

import java.util.*;

public class P002C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xa = sc.nextInt();
        int ya = sc.nextInt();
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        xb -= xa;
        yb -= ya;
        xc -= xa;
        yc -= ya;
        double area = ((double)Math.abs(xb*yc-yb*xc))/2;
        System.out.println(area);
    }
}
