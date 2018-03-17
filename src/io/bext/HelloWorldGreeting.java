package io.bext;

public class HelloWorldGreeting implements InterGreeting {
    @Override
    public void perform() {
        System.out.println("Hello World desde HelloWorldGreeting");
    }
}
