package ScriptCofee;

import java.util.function.Predicate;

public class CaffeineBuzz {
    public static String caffeineBuzz(int n) {
        Predicate<Integer> three = x -> x % 2 ==0;
        Predicate<Integer> one = x -> ((x % 3) == 0);
        if (one.test(n)) {
            if (three.test(n)) {
                return "JavaScript";
            }
            return "Java";
        }
        Predicate<Integer> two = x -> one.test(x) && ((x % 4) == 0);
        if (two.test(n)) {
            if (three.test(n)) {
                return "CoffeeScript";
            }
            return "Coffee";
        }
        return "mocha_missing!";
    }

    public static void main(String[] args) {
        int n = 780;
        String result = caffeineBuzz(n);
        System.out.println(result);
    }
}

