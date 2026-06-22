package RecoverASecretStringFromRandomTriplets;

import java.util.HashSet;
import java.util.Set;

public class SecretDetective {

    public String recoverSecret(char[][] triplets) {
        //Guarda elementos sem repetição
        Set<Character> set = new HashSet<>();
        String secret = "";
        for (char[] t : triplets) {
            set.add(t[0]);
            set.add(t[1]);
            set.add(t[2]);
        }
        return recover(set, triplets);
    }

    private String recover(Set<Character> set, char[][] triplets) {
        //caso base: se for vazia acaba
        if (set.isEmpty()) return "";

        for (char cand : set) {
            boolean hasBefore = false;

            for (char[] c : triplets) {
                //pega as letras do trio
                char first = c[0];
                char second = c[1];
                char third = c[2];

                //verifica se tem anterior
                if (cand == second && set.contains(first) || cand == third && set.contains(first) || cand == third && set.contains(second)) {
                    hasBefore = true;
                    break;
                }
            }
            //se não tiver anterior, ela é a pro´xima
            if (!hasBefore) {
                //remove a letra da lista das letras
                set.remove(cand);
                //retorna essa letra + o resultado do resto
                return cand + recover(set, triplets);
            }
        }
        //caso dê erro
        return "";
    }

    public static void main(String[] args) {

    }


}
