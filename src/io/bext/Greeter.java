package io.bext;

public class Greeter {

    public void greet(InterGreeting interGreeting) {
        interGreeting.perform();
    }

    public static void main(String... args) {
        Greeter greeter = new Greeter();

        InterGreeting myLambdafunction = () -> System.out.println("Hola desde lambda function");

        InterGreeting innerClass = new InterGreeting() {
            @Override
            public void perform() {
                System.out.println("Hola desde inner Class");
            }
        };

        myLambdafunction.perform();  //implementando una Clase
        innerClass.perform();   //implementando una inner class

        greeter.greet(myLambdafunction);
        greeter.greet(() -> System.out.println("Hola desde lambda function"));
        greeter.greet(innerClass);

    }
}

