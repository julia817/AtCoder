import java.util.*;

public class P002C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next();

        String[] shortcut = {"AA","BB","XX","YY","AB","BA","AX","XA","AY","YA","BX","XB","BY","YB","XY","YX"};

        // int buttons = 10000;
        // String copy_input = input;
        // for (int i=0; i<n-1; i++) {
        //     String copy_input2 = copy_input.replace(copy_input.substring(i,i+2), "L");
        //     //System.out.println(copy_input2);
        //     for (int j=0; j<shortcut.length; j++) {
        //         if (copy_input2.contains(shortcut[j])) {
        //             copy_input = copy_input.replace(copy_input.substring(i,i+2), "L");
        //             copy_input = copy_input.replace(shortcut[j], "R");
        //             System.out.println(copy_input);
        //             if (copy_input.length()<buttons)
        //                 buttons = copy_input.length();
        //         }
        //     }
        //     copy_input = input;
        // }

        // int buttons = 100000000;
        // String copy_input = input;
        // for (int i=0; i<shortcut.length; i++) {
        //     for (int j=i+1; j<shortcut.length; j++) {
        //         if (i!=j && copy_input.contains(shortcut[i]) && copy_input.contains(shortcut[j])) {
        //             copy_input = copy_input.replace(shortcut[i], "L");
        //             copy_input = copy_input.replace(shortcut[j], "R");
        //             if (copy_input.length()<buttons)
        //                 buttons = copy_input.length();
        //             copy_input = input;
        //         }
        //     }
        // }
        //
        // System.out.println(buttons);

        int min = Integer.MAX_VALUE;
        String[] button = {"A", "B", "X", "Y"};

        for (int i = 0; i < button.length; i++) {
            for (int j = 0; j < button.length; j++) {
                for (int k = 0; k < button.length; k++) {
                    for (int l = 0; l < button.length; l++) {
                        String shortA = button[i] + button[j];
                        String shortB = button[k] + button[l];
                        String tmpA = input.replace(shortA, "L").replace(shortB, "R");
                        String tmpB = input.replace(shortB, "L").replace(shortA, "R");
                        min = Math.min(min, Math.min(tmpA.length(), tmpB.length()));
                    }
                }
            }
        }

        System.out.println(min);
    }
}
