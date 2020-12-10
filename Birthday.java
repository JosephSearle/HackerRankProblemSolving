import java.util.ArrayList;

public class Birthday {

    public static void main(String[] args) {

    }

    public static int birthday(ArrayList<Integer> s, int d, int m) {
        int count = 0;
        int last = s.size() - 1;
        // add until it equals d
        // check if length of array is less than m

        for (int num : s) {
            ArrayList<Integer> sum = new ArrayList<>();
            sum.add(num);
            int day = num;
            if (s.size() == 1 && day == d && m == 1) {
                count++;
                break;
            }
            if (num == last)
                break;
            for (int i = num + 1; i < s.size(); i++) {
                if (day + s.get(i) <= d) {
                    day = day + s.get(i);
                    sum.add(s.get(i));
                } else {

                }
                if (day == d)
                    break;
            }
            if (sum.size() == m) {
                count++;
            }
        }

        return count;
    }
}
