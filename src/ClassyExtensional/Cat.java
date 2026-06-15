package ClassyExtensional;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // your code here
    @Override
    public String speak() {
        return this.name + " meow";
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers");
        cat.speak();
    }
}
