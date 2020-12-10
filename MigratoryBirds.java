import java.util.ArrayList;

public class MigratoryBirds {

    public static void main(String[] args) {

    }

    public static int migratoryBirds(ArrayList<Integer> birds) {
        int id = 0;
        int len = 0;
        ArrayList<Integer> cache = new ArrayList<>();

        for (int bird : birds) {
            int l = 1;
            if (!cache.contains(bird)) {
                cache.add(bird);
                for (int i = birds.indexOf(bird) + 1; i < birds.size(); i++) {
                    if (birds.get(i) == bird) {
                        l++;
                    }
                }
            }
            if (l > len) {
                id = bird;
                len = l;
            }
            if (l == len) {
                if (bird < id) {
                    id = bird;
                    len = l;
                }
            }
        }
        return id;
    }
}
