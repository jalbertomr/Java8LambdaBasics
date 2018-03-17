package io.bext;

public class Greeter {

    public void greet(InterGreeting interGreeting) {
        interGreeting.perform();
    }

    public static void main(String... args) {
        Greeter greeter = new Greeter();
        InterGreeting holaMundoGreeting = new HolaMundoGreeting();
        InterGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(holaMundoGreeting);
        greeter.greet(helloWorldGreeting);

        MyLambda myLambdaFunction       = () -> System.out.println("Hola desde lambda function");
        InterGreeting myLambdafunction2 = () -> System.out.println("Hola desde lambda function");

        greeter.greet(myLambdafunction2);

        MyAdd myAddLambda = (int a, int b) -> a + b;
    }
}

interface MyLambda {
    void perform();
}

interface MyAdd {
    int add(int a, int b);
}