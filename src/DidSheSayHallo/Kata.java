package DidSheSayHallo;

public class Kata{
    public static boolean validateHello(String greetings){
        //Your code
        if (greetings.toLowerCase().contains("hello") || greetings.toLowerCase().contains("ciao") || greetings.toLowerCase().contains("salut") || greetings.toLowerCase().contains("hola") || greetings.toLowerCase().contains("ahoj") || greetings.toLowerCase().contains("czesc") || greetings.toLowerCase().contains("hallo")) return true;
        return false;
    }

    public static void main(String[] args) {
        String greetings = "AHOJ!";
        System.out.println(validateHello(greetings));
    }

}
