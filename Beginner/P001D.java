import java.util.*;

public class P001D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Interval> time = new ArrayList<Interval>();
        for (int i=0; i<n; i++) {
            String input = sc.next();
            int start = Integer.parseInt(input.substring(0,4));
            int end = Integer.parseInt(input.substring(5,9));
            //時間丸める
            start = start-start%5;
            int min = end%10;
            if (min>=1 && min<=4)
                end = end + (5-min);
            else if (min>=6 && min<=9)
                end = end + (10-min);
            if (end%100 == 60)
                end += 40;
            time.add(new Interval(start, end));
        }

        Collections.sort(time, new IntervalComparator());

        ArrayList<Interval> result = new ArrayList<Interval>();
        result.add(time.get(0));
        if (time.size()>1) {
            for (int i=1; i<time.size(); i++) {
                int start1 = result.get(result.size()-1).getStart();
                int start2 = time.get(i).getStart();
                int end1 = result.get(result.size()-1).getEnd();
                int end2 = time.get(i).getEnd();
                if (start2 == start1) {
                    if (end2 > end1)
                        result.get(result.size()-1).setEnd(end2);
                }
                else if (start2 > start1) {
                    if (start2 <= end1) {
                        if (end2 > end1)
                            result.get(result.size()-1).setEnd(end2);
                    }
                    else
                        result.add(time.get(i));
                }
            }
        }

        for(int i=0; i<result.size(); i++) {
            System.out.println(result.get(i).toString());
        }
    }

    public static class Interval {
        int start;
        int end;

        public Interval(int s, int e) {
            start = s;
            end = e;
        }

        public void setStart(int s) {
            start = s;
        }

        public void setEnd(int e) {
            end = e;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return String.format("%04d-%04d", start, end);
        }
    }

    //compare time interval
    public static class IntervalComparator implements Comparator<Interval> {
    	@Override
    	public int compare(Interval i1, Interval i2) {
            if (i1.start < i2.start)
                return -1;
            else if (i1.start > i2.start)
                return 1;
            else {
                if (i1.end < i2.end)
                    return -1;
                else if (i1.end > i2.end)
                    return 1;
                else
                    return 0;
            }
    	}
    }
}
