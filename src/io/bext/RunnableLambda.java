package io.bext;

public class RunnableLambda {
    public static void main(String... args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Impreso dentro de Runnable");
            }
        });

        Thread myThreadLambda = new Thread( () -> System.out.println("Impreso dentro de lambda runnable"));

        myThread.run();
        myThreadLambda.run();
    }

}
