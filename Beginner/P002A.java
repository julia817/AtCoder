import java.util.*;

public class P002A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x>y)
            System.out.println(x);
        else if (y>x)
            System.out.println(y);
    }
}
