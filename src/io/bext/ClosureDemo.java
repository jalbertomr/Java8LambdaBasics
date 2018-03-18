package io.bext;

public class ClosureDemo {

    public static void main(String... args) {
        int a = 7;
        int b = 13;   //esta variable no puede cambiar
        doProcess(a, System.out::println);
        doProcess(a, i -> System.out.println(i + b));  //se conjela en valor de b
    }

    private static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}