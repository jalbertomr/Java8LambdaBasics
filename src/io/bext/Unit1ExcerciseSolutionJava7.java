package io.bext;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutionJava7 {
    public static void main(String... args) {
        List<Person> personas = Arrays.asList(
                new Person("Carlos", "Camaro", 12),
                new Person("Ignacio", "Aldama", 24),
                new Person("Juan", "Lopez", 23),
                new Person("Corina", "Perez", 18),
                new Person("Matias", "Canos", 32)
        );

        // step 1: ordenar la lista por apellidos
        Collections.sort(personas, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getApellidos().compareTo(o2.getApellidos());
            }
        });
        // step 2: crear un metodo que imprima todos los elementos de la list
        printAll(personas);
        // step 3: crear un metodo que imprima todos los elementos cuyo apellido comience con C
        printAllApellido_C(personas);

    }

    private static void printAllApellido_C(List<Person> personas) {
        for (Person persona: personas ) {
            if (persona.getApellidos().startsWith("C")) {
                System.out.println(persona.toString());
            }
        }
    }

    private static void printAll(List<Person> personas) {
        for (Person persona: personas) {
            System.out.println(persona.toString());
        }
    }
}
