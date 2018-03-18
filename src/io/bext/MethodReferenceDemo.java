package io.bext;

public class MethodReferenceDemo {

    public static void main(String... args) {

        Thread t = new Thread(MethodReferenceDemo::printMessage);  // Method Reference
        t.start();
    }

    public static void printMessage() {
        System.out.println("Hola desde Thread-Method Reference");
    }
}
