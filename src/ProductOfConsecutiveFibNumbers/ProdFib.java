package ProductOfConsecutiveFibNumbers;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProdFib {
    public static long[] productFib(long prod) {
        ArrayList<Long> lista = new ArrayList<>();
        ArrayList<Integer> fenal = new ArrayList<>();
        lista.add(0L); lista.add(1L);
        while (true) {
            int ultimo = lista.size() - 1;

            long proximo = lista.get(ultimo) + lista.get(ultimo - 1);

            lista.add(proximo);

            if (proximo * lista.get(ultimo) >= prod) {
                break;
            }
        }
        int idx = IntStream.range(0, lista.size() - 1)
                .filter(i -> lista.get(i) * lista.get(i + 1) >= prod)
                .findFirst()
                .orElseThrow();
        return new long[]{lista.get(idx), lista.get(idx + 1), lista.get(idx) * lista.get(idx + 1) == prod ? 1 : 0};
    }

    public static void main(String[] args) {
        long prod = 22;
        long[] result = productFib(prod);
    }
}
