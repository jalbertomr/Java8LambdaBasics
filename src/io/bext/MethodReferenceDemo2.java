package io.bext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceDemo2 {
    public static void main(String... args) {
        List<Person> personas = Arrays.asList(
                new Person("Carlos", "Camaro", 12),
                new Person("Ignacio", "Aldama", 24),
                new Person("Juan", "Lopez", 23),
                new Person("Corina", "Perez", 18),
                new Person("Matias", "Canos", 32)
        );


        // step 2: crear un metodo que imprima todos los elementos de la list
        System.out.println("imprimiendo todas la personas");
        performConditionally(personas, p -> true, System.out::println);
                                            // p -> System.out.println(p) ==> System.out::println
    }

    private static void performConditionally(List<Person> personas, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
        for (Person persona: personas ) {
            if (personPredicate.test(persona)){
                personConsumer.accept(persona);
            }
        }
    }

}
