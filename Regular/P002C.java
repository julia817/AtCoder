//Shejia Zhu
//2018-06-04
//To be modified

import java.util.*;

public class P002C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        String[] shortcut = {"AA","BB","XX","YY","AB","BA","AX","XA","AY","YA","BX","XB","BY","YB","XY","YX"};

        int buttons = 100000000;
        String copy_input = input;
        for (int i=0; i<shortcut.length; i++) {
            for (int j=i+1; j<shortcut.length; j++) {
                if (i!=j && copy_input.contains(shortcut[i]) && copy_input.contains(shortcut[j])) {
                    copy_input = copy_input.replace(shortcut[i], "L");
                    copy_input = copy_input.replace(shortcut[j], "R");
                    if (copy_input.length()<buttons)
                        buttons = copy_input.length();
                    copy_input = input;
                }
            }
        }

        System.out.println(buttons);
    }
}
