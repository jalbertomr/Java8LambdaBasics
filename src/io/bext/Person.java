package io.bext;

public class Person {
    private String Nombres;
    private String Apellidos;
    private int edad;

    public Person(String nombres, String apellidos, int edad) {
        Nombres = nombres;
        Apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Nombres='" + Nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
