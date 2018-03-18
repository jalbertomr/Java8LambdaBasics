package io.bext;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationDemo {

    public static void main(String... args) {
        List<Person> personas = Arrays.asList(
                new Person("Carlos", "Camaro", 12),
                new Person("Ignacio", "Aldama", 24),
                new Person("Juan", "Lopez", 23),
                new Person("Corina", "Perez", 18),
                new Person("Matias", "Canos", 32)
        );
        System.out.println("Usando for( i ... ");
        for (int i = 0; i < personas.size() ; i++) {
            System.out.println(personas.get(i));
        }

        System.out.println("Usando for(<T> t : ts)");
        for (Person persona: personas ) {
            System.out.println(persona);
        }

        System.out.println("Usando forEach");
        personas.forEach(p -> System.out.println(p));  //lambda
        personas.forEach(System.out::println);          //method reference
    }
}
