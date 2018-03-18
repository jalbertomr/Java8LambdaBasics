package io.bext;

public class MethodReferenceDemo {

    public static void main(String... args) {

        Thread t = new Thread(() -> printMessage());  // a sustituir por method reference
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hola desde Thread-lambda");
    }
}
