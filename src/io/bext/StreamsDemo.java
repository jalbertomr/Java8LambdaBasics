package io.bext;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

    public static void main(String... args) {

        List<Person> personas = Arrays.asList(
                new Person("Carlos", "Camaro", 12),
                new Person("Ignacio", "Aldama", 24),
                new Person("Juan", "Lopez", 23),
                new Person("Corina", "Perez", 18),
                new Person("Matias", "Canos", 32)
        );

        System.out.println("personas nombre empieza con 'C'");
        personas.stream()
                .filter(p -> p.getNombres().startsWith("C"))
                .forEach(System.out::println);

        System.out.println("Apellidos personas edad > 20");
        personas.stream()
                .filter(p -> p.getEdad() > 20)
                .forEach(p -> {
                    System.out.println(p.getApellidos() + " edad: " + p.getEdad());
                });
        System.out.println("personas nombre empieza con 'C' y a Mayusculas");
        personas.stream()
                .filter(p -> p.getNombres().startsWith("C"))
                .map(p -> p.toString().toUpperCase())
                .forEach(System.out::println);

        long count = personas.stream()
                .filter(person -> person.getNombres().startsWith("C"))
                .count();
        System.out.println(count);

        personas.parallelStream()
                //.map(person -> personas.toString().toLowerCase())
                .forEach(System.out::println);
    }
}
