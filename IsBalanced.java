import java.util.Stack;

public class IsBalanced {

    public static void main(String[] args) {

    }

    public static String isBalanced(String s) {
        char[] ar = s.toCharArray();
        Stack<Character> half = new Stack<Character>();

        if (ar.length % 2 == 1) {
            return "NO";
        }

        for (int i = 0; i < ar.length / 2; i++) {
            half.push(ar[i]);
        }

        for (int i = ar.length / 2; i < ar.length; i++) {
            char pop = half.pop();
            char one = '}';
            char two = ')';
            char three = ']';
            if (pop == '{' && ar[i] == one) {

            } else if (pop == '(' && ar[i] == two) {

            } else if (pop == '[' && ar[i] == three) {

            } else {
                return "NO";
            }
        }
        return "YES";
    }
}