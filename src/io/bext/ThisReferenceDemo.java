package io.bext;

public class ThisReferenceDemo {

    public static void main(String... args) {

        ThisReferenceDemo thisReferenceDemo = new ThisReferenceDemo();
        thisReferenceDemo.doProcess(10, i -> {
                System.out.println("valor de i: " + i);
                //System.out.println(this);     //ahora hace referencia al this del entorno, lo cual es error
            });

    }

    private void doProcess(int i, Process p) {
        p.process(i);
    }
}
