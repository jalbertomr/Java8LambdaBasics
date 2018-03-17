package io.bext;

public class Greeter {

    public void greet(InterGreeting interGreeting) {
        interGreeting.perform();
    }

    public static void main(String... args) {
        Greeter greeter = new Greeter();

        InterGreeting holaMundoGreeting = new HolaMundoGreeting();
        InterGreeting myLambdafunction = () -> System.out.println("Hola desde lambda function");

        holaMundoGreeting.perform();  //implementando una Clase
        myLambdafunction.perform();   //implementando una function

        greeter.greet(holaMundoGreeting);
        greeter.greet(myLambdafunction);

    }
}

