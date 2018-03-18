package io.bext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesDemo {
    public static void main(String... args) {
        List<Person> personas = Arrays.asList(
                new Person("Carlos", "Camaro", 12),
                new Person("Ignacio", "Aldama", 24),
                new Person("Juan", "Lopez", 23),
                new Person("Corina", "Perez", 18),
                new Person("Matias", "Canos", 32)
        );

        // step 1: ordenar la lista por apellidos
        System.out.println("ordenando");
        Collections.sort(personas, (o1, o2) -> o1.getApellidos().compareTo(o2.getApellidos()));

        // step 2: crear un metodo que imprima todos los elementos de la list
        System.out.println("imprimiendo todas la personas");
        performConditionally(personas, p -> true, p -> System.out.println(p));

        // step 3: crear un metodo que imprima todos los elementos cuyo apellido comience con C
        System.out.println("imprimiendo personas apellido empiece con 'C'");
        performConditionally(personas, (p) -> p.getApellidos().startsWith("C"), p-> System.out.println(p.getApellidos()));
        //
        System.out.println("imprimiendo personas nombre empiece con 'M'");
        performConditionally(personas, (p) -> p.getNombres().startsWith("M"), p-> System.out.println(p.getNombres()));

    }

    private static void performConditionally(List<Person> personas, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
        for (Person persona: personas ) {
            if (personPredicate.test(persona)){
                personConsumer.accept(persona);
            }
        }
    }

}
