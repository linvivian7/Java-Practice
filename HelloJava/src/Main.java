import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Admin on 3/14/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java!!!!");
        List<Integer> B = new ArrayList<Integer>();
        B.add(12);
        B.add(2);
        B.add(1);
        B.add(15);
        B.add(2);
        B.add(4);
        rearrange(B);
        System.out.println(B);
    }


    public static int smallestNonconstructibleValue(List<Integer> A) {
        Collections.sort(A);
        int maxConstructibleValue = 0;
        for (int a : A) {
            System.out.println("a" + a);
            System.out.println("max" + maxConstructibleValue);

            if (a > maxConstructibleValue + 1) {
                break ;
            }
            maxConstructibleValue += a;
        }
        return maxConstructibleValue + 1;

    }


    public static void rearrange(List<Integer> A) {
        for (int i = 1; i < A.size()        ; ++i)
            if (((i % 2) == 0 && A.get(i - 1) < A.get(i)) || ((i % 2) != 0 && A.get(i - 1) > A.get(i))) {
                Collections.swap(A, i - 1, i);
            }
    }

}

