package io.bext;

public class TypeInferenceDemo {
    public static void main(String... args) {

        //StringLengthLambda myLambda = (String s) -> s.length();    //La interface funcional al tener un solo metodo sabe que tipo de dato parametriza
        //StringLengthLambda myLambda = (s) -> s.length();
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Hola miLambda getlength()"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda lambda) {
        System.out.println( lambda.getLength("Dato para lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}

