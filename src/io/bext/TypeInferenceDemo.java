package io.bext;

public class TypeInferenceDemo {
    public static void main(String... args) {

        //StringLengthLambda myLambda = (String s) -> s.length();    //La interface funcional al tener un solo metodo sabe que tipo de dato parametriza
        StringLengthLambda myLambda = (s) -> s.length();
        System.out.println(myLambda.getLength("Hola miLambda getlength()"));

    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}

