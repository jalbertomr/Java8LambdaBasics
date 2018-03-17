package io.bext;

public class Greeter {

    public void greet(InterGreeting interGreeting) {
        interGreeting.perform();
    }

    public static void main(String... args) {
        Greeter greeter = new Greeter();
        HolaMundoGreeting holaMundoGreeting = new HolaMundoGreeting();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(holaMundoGreeting);
        greeter.greet(helloWorldGreeting);
    }
}

