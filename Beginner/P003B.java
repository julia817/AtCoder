//Shejia Zhu
//2018-06-09

import java.util.*;

public class P003B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        ArrayList<Character> card = new ArrayList<Character>();
        card.add('a');
        card.add('t');
        card.add('c');
        card.add('o');
        card.add('d');
        card.add('e');
        card.add('r');
        if (s.equals(t))
            System.out.println("You can win");
        else if (!(s.contains("@")) && !(t.contains("@")))
            System.out.println("You will lose");
        else {
            for (int i=0; i<s.length(); i++) {
                char s_chara = s.charAt(i);
                char t_chara = t.charAt(i);
                if ((s_chara!='@' && t_chara!='@') && (s_chara != t_chara)) {
                    System.out.println("You will lose");
                    System.exit(0);
                }
                else if (s_chara==t_chara)
                    continue;
                else {
                    if (s_chara=='@') {
                        if (card.contains(t_chara))
                            continue;
                        else {
                            System.out.println("You will lose");
                            System.exit(0);
                        }
                    }
                    else if (t_chara=='@') {
                        if (card.contains(s_chara))
                            continue;
                        else {
                            System.out.println("You will lose");
                            System.exit(0);
                        }
                    }
                }
            }
            System.out.println("You can win");
        }
    }
}
