//Shejia Zhu
//2018-06-07

import java.util.*;

public class P003A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double salary = 0;
        for (int i=1; i<=n; i++) {
            salary += (double)i*10000/n;
        }
        System.out.println((int)salary);
    }
}
