import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Admin on 3/18/17.
 */
public class Stack {
    public static boolean isWellFormed(String s) {
        Deque<Character> leftChars = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftChars.addFirst(s.charAt(i));
            } else {
                if (leftChars.isEmpty()) {
                    return false;
                }
                if (s.charAt(i) == ')' && leftChars.peekFirst() != '(') {
                    return false;
                }
                leftChars.removeFirst();
            }
        System.out.println(i);
        }
        return leftChars.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isWellFormed("((((()))))"));
    }
}
