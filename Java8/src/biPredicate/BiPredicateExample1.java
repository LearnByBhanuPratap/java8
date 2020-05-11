package biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    public static void main(String[] args) {

        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("hellojava", 9);
        System.out.println(result);  // true

        boolean result2 = filter.test("hellojava", 10);
        System.out.println(result2); // false
    }

}