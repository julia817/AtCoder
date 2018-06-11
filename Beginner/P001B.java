//Shejia Zhu
//2018-06-03

import java.util.*;

public class P001B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m<100)
            System.out.println("00");
        else if (m>=100 && m<=5000) {
            if (m<1000)
                System.out.println("0"+m/100);
            else {
                double km = (double)m/1000;
                System.out.println((int)(km*10));
            }
        }
        else if (m>=6000 && m<=30000)
            System.out.println(m/1000+50);
        else if (m>=35000 && m<=70000)
            System.out.println((m/1000-30)/5+80);
        else
            System.out.println(89);
    }
}
