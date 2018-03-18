package io.bext;

public class ClosureDemo {

    public static void main(String... args) {
        int a = 7;
        int b = 13;   //esta variable no puede cambiar
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i + b);
            }
        });
    }

    private static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}