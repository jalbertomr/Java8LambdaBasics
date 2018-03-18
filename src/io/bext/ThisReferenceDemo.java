package io.bext;

public class ThisReferenceDemo {

    public static void main(String... args) {

        ThisReferenceDemo thisReferenceDemo = new ThisReferenceDemo();
        thisReferenceDemo.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("valor de i: " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "this - la innerclase anonima";
            }

        });

    }

    private void doProcess(int i, Process p) {
        p.process(i);
    }
}
