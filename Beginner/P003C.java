//Shejia Zhu
//2018-06-14

import java.io.*;
import java.util.*;

public class P003C {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);
        String[] input2 = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>(input2.length);
        for (String s: input2) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);

        double rate = 0;
        for (int i=n-k; i<n; i++) {
            rate = (double)(rate+list.get(i))/2;
        }

        System.out.println(rate);
    }
}
