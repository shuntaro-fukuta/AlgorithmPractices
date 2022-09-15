// https://www.codewars.com/kata/5672682212c8ecf83e000050/train/java

import java.util.LinkedList;
import java.util.List;

public class DoubleLinear {
    public static void main(String[] args) {
        System.out.println(dblLinear(20));
    }

    public static int dblLinear (int n) {
        List<Integer> numbers = new LinkedList<Integer>(){{ add(1); }};
        int yIndex = 0;
        int zIndex = 0;
        for (int i = 0; i < n; i++) {
            int y = 2 * numbers.get(yIndex) + 1;
            int z = 3 * numbers.get(zIndex) + 1;

            if (y <= z) {
                numbers.add(y);
                yIndex++;
                if (y == z) {
                    zIndex++;
                }
            } else {
                numbers.add(z);
                zIndex++;
            }
        }

        return numbers.get(n);
    }
}

