package Scramblies;

import java.util.Arrays;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        String str1Low = str1.toLowerCase();String str2Low = str2.toLowerCase();

        int list[] = new int[26];
        //Cria estoque com quantidade de cada letra
        str1Low.chars().forEach(c -> list[c - 'a']++);
        // para cada letra de str2, você tenta gastar uma letra do estoque
        return str2Low.chars().allMatch(c -> --list[c - 'a'] >= 0);

    }

    public static void main(String[] args) {
        String str1 = "rkqodlw";
        String str2 = "world";
        boolean result = scramble(str1, str2);
        System.out.println(result);
    }
}
