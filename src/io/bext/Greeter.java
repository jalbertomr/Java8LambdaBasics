package io.bext;

public class Greeter {

    public void greet() {
        System.out.println("Hola a Todos..!");
    }

    public static void main(String... args) {
        Greeter greeter = new Greeter();
        greeter.greet();
    }
}
