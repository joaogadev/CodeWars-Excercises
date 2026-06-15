package SimplePigLatin;

import java.util.ArrayList;
import java.util.Arrays;

public class PigLatin {
    public static String pigIt(String str) {
        String[] text = str.split(" ");
        ArrayList<String> ForFinal = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals("!") || text[i].equals("?")) {
                ForFinal.add(text[i]);
                continue;
            }
            String first = text[i].substring(0, 1);
            int tam = text[i].length();
            String rest = text[i].substring(1, tam);
            String result = rest + first + "ay";
            System.out.println(result);
            ForFinal.add(result);
        }
        return String.join(" ", ForFinal);
        // ou usando stream
        //return Arrays.stream(str.trim().split(" "))
        //                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
        //                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String str = "Pig latin is cool !";
        String result = pigIt(str);
        System.out.println(result);
    }
}
