//Shejia Zhu
//2018-06-03

import java.util.*;

public class P002A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if (y%400 == 0)
            System.out.println("YES");
        else if (y%100 == 0)
            System.out.println("NO");
        else if (y%4 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
