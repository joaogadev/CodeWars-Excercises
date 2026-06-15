package FriendOrFoe;

import java.util.List;

public class Kata {
    public static List<String> friend(List<String> x){
        return x.stream()
                .filter(name -> name.length() == 4)
                .toList();
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ryan", "Kieran", "Mark");
        List<String> friends = friend(names);
        System.out.println(friends);
    }
}
