package io.bext;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava8 {
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
        printConditionally(personas,p -> true);

        // step 3: crear un metodo que imprima todos los elementos cuyo apellido comience con C
        System.out.println("imprimiendo personas apellido empiece con 'C'");
        printConditionally(personas, (p) -> p.getApellidos().startsWith("C"));
        //
        printConditionally(personas, (p) -> p.getNombres().startsWith("M"));

    }

    private static void printConditionally(List<Person> personas, Condition condition) {
        for (Person persona: personas ) {
            if (condition.test(persona)){
                System.out.println(persona.toString());
            }
        }
    }
}

