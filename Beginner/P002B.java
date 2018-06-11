//Shejia Zhu
//2018-06-04

import java.util.*;

public class P002B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("a"))
            s = s.replace("a","");
        if (s.contains("i"))
            s = s.replace("i","");
        if (s.contains("u"))
            s = s.replace("u","");
        if (s.contains("e"))
            s = s.replace("e","");
        if (s.contains("o"))
            s = s.replace("o","");
        System.out.println(s);
    }
}
