import java.util.*;

public class P001C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deg = (double)sc.nextInt()/10;
        double dis = (double)sc.nextInt()/60;
        String dir = "";
        int w = 0;
        dis = Double.parseDouble(String.format("%.1f", dis));

        if (deg>=11.25 && deg<33.75)
            dir = "NNE";
        else if (deg>=33.75 && deg<56.25)
            dir = "NE";
        else if (deg>=56.25 && deg<78.75)
            dir = "ENE";
        else if (deg>=78.75 && deg<101.25)
            dir = "E";
        else if (deg>=101.25 && deg<123.75)
            dir = "ESE";
        else if (deg>=123.75 && deg<146.25)
            dir = "SE";
        else if (deg>=146.25 && deg<168.75)
            dir = "SSE";
        else if (deg>=168.75 && deg<191.25)
            dir = "S";
        else if (deg>=191.25 && deg<213.75)
            dir = "SSW";
        else if (deg>=213.75 && deg<236.25)
            dir = "SW";
        else if (deg>=236.25 && deg<258.75)
            dir = "WSW";
        else if (deg>=258.75 && deg<281.25)
            dir = "W";
        else if (deg>=281.25 && deg<303.75)
            dir = "WNW";
        else if (deg>=303.75 && deg<326.25)
            dir = "NW";
        else if (deg>=326.25 && deg<348.75)
            dir = "NNW";
        else
            dir = "N";

        if (dis>=0.0 && dis<=0.2) {
            w = 0;
            dir = "C";
        }
        else if (dis>=0.3 && dis<=1.5)
            w = 1;
        else if (dis>=1.6 && dis<=3.3)
            w = 2;
        else if (dis>=3.4 && dis<=5.4)
            w = 3;
        else if (dis>=5.5 && dis<=7.9)
            w = 4;
        else if (dis>=8.0 && dis<=10.7)
            w = 5;
        else if (dis>=10.8 && dis<=13.8)
            w = 6;
        else if (dis>=13.9 && dis<=17.1)
            w = 7;
        else if (dis>=17.2 && dis<=20.7)
            w = 8;
        else if (dis>=20.8 && dis<=24.4)
            w = 9;
        else if (dis>=24.5 && dis<=28.4)
            w = 10;
        else if (dis>=28.5 && dis<=32.6)
            w = 11;
        else if (dis>=32.7)
            w = 12;

        System.out.println(dir+" "+w);
    }
}
