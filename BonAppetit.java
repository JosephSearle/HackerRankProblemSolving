import java.util.ArrayList;

public class BonAppetit {

    public static void main(String[] args) {

    }

    public static void bonAppetit(ArrayList<Integer> bill, int k, int b) {
        ArrayList<Integer> re = new ArrayList<>();
        double total = 0;
        for (int price : bill) {
            if (price != bill.get(k)) {
                re.add(price);
            }
        }

        for (int price : re) {
            total += price;
        }

        total = total / 2;

        int l = (int) total;
        if (l < b) {
            System.out.println(b - l);
        } else if (l == b) {
            System.out.println("Bon Appetit");
        }
    }
}
